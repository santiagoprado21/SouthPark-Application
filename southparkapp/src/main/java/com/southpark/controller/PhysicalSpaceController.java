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

import com.southpark.domain.PhysicalSpace;
import com.southpark.service.PhysicalSpaceService;

@RestController
@RequestMapping("/physicalSpace")
public class PhysicalSpaceController {
	
	@Autowired
	private PhysicalSpaceService physicalSpaceService;

	@PostMapping("/addPhysicalSpace")
	public PhysicalSpace postDetails(@RequestBody PhysicalSpace physicalSpace) throws Exception {
		return physicalSpaceService.save(physicalSpace);
	}
	
	@GetMapping("/all")
	public List<PhysicalSpace> findAll(){
	    return physicalSpaceService.findAll();
	}
	
	@GetMapping("/find/{id}")
	public Optional<PhysicalSpace> findById(@PathVariable String id) {
		return physicalSpaceService.findBy(id);
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) throws Exception {
	    Optional<PhysicalSpace> physicalSpaceOptional = physicalSpaceService.findBy(id);
	    
	    if (physicalSpaceOptional.isPresent()) {
	    	physicalSpaceService.deleteById(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
	
}
