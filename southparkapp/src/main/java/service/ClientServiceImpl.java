package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.southpark.domain.ActivityDetails;
import com.southpark.domain.Client;

import exception.ResourceNotFoundException;
import repository.ClientRepository;

@RestController
@RequestMapping("/api/v1")
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientRepository clientRepository;
	
	
	@Override
	@GetMapping("/clients")
	public List<Client> findAll() {
		List<Client> lstClient = clientRepository.findAll();
		return lstClient;
	}

	@Override
	@GetMapping("/clients/{id}")
	public Optional<Client> findBy(@PathVariable String id) {
		Optional<Client> client = clientRepository.findById(id);
		
		if (!(client instanceof Optional<Client>)) {
			throw new ResourceNotFoundException("Client not found: " + id);
		}
		return client;
	}

	@Override
	@PostMapping("/clients")
	public Client save(@RequestBody Client entity) throws Exception {
		return clientRepository.save(entity);
	}

	@Override
	@PutMapping("/clients/{id}")
	public Client update(@RequestBody Client entity) throws Exception {
		return clientRepository.save(entity);
	}

	@Override
	public void delete(Client entity) throws Exception {
		clientRepository.delete(entity);
	}

	@Override
	@DeleteMapping("/clients/{id}")
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
