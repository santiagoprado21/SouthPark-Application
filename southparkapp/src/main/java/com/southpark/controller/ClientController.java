package com.southpark.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.southpark.domain.Client;
import com.southpark.service.ClientService;

@RestController
@RequestMapping("/clients")
@CrossOrigin("*")
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	
	@PostMapping("/addClient")
	public Client postDetails(@RequestBody Client client) throws Exception {
		return clientService.save(client);
	}
	
	@GetMapping("/all")
	public List<Client> findAll(){
	    return clientService.findAll();
	}
	
	@GetMapping("/find/{id}")
	public Optional<Client> findById(@PathVariable String id) {
		return clientService.findBy(id);
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) throws Exception {
	    Optional<Client> clientOptional = clientService.findBy(id);
	    
	    if (clientOptional.isPresent()) {
	        clientService.deleteById(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
	
}
