package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.southpark.domain.ActivityDetails;
import com.southpark.domain.Client;

import repository.ClientRepository;

public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public List<Client> findAll() {
		List<Client> lstClient = clientRepository.findAll();
		return lstClient;
	}

	@Override
	public Optional<Client> findBy(String id) {
		return clientRepository.findById(id);
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