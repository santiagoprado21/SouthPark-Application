package com.southpark.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.southpark.domain.Rol;
import com.southpark.service.RolService;

@RestController
@RequestMapping("/roles")
public class RolController {
	
	@Autowired
	private RolService rolService;

	@PostMapping("/addRol")
	public Rol postDetails(@RequestBody Rol rol) throws Exception {
		return rolService.save(rol);
	}
	
	@GetMapping("/all")
	public List<Rol> findAll(){
	    return rolService.findAll();
	}
	
	@GetMapping("/find/{id}")
	public Optional<Rol> findById(@PathVariable String id) {
		return rolService.findBy(id);
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) throws Exception {
	    Optional<Rol> rolOptional = rolService.findBy(id);
	    
	    if (rolOptional.isPresent()) {
	    	rolService.deleteById(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
	
}
