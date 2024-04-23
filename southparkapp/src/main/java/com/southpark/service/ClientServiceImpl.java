package com.southpark.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.southpark.domain.Client;

import com.southpark.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientRepository clientRepository;
	
	
	@Override
	public List<Client> findAll() {
		List<Client> lstClient = clientRepository.findAll();
		return lstClient;
	}

	@Override
	public Optional<Client> findBy (String id) {
		Optional<Client> client = clientRepository.findById(id);
		return client;
	}

	@Override
	public Client save(Client entity) throws Exception {
		return clientRepository.save(entity);
	}

	@Override
	public Client update(Client entity) throws Exception {
		return clientRepository.save(entity);
	}

	@Override
	public void delete(Client entity) throws Exception {
		clientRepository.delete(entity);
	}

	@Override
	public void deleteById(String id) throws Exception {
		clientRepository.deleteById(id);
	}

	@Override
	public void validate(Client entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		return clientRepository.count();
	}
}
