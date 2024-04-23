package com.southpark.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.southpark.domain.Client;
import com.southpark.service.ClientService;

@RestController
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@PostMapping("/addClient")
	public Client postDetails(@RequestBody Client client) throws Exception {
		return clientService.save(client);
	}
	
	
}
