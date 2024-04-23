package com.southpark.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.southpark.domain.Availability;
import com.southpark.repository.AvailabilityRepository;

public class AvailabilityServiceImpl implements AvailabilityService{

	
	@Autowired
	private AvailabilityRepository availabilityRepository;
	
	@Override
	public List<Availability> findAll() {
		List<Availability> lstAvailability =  availabilityRepository.findAll();
		return lstAvailability;
	}


	@Override
	public Availability save(Availability entity) throws Exception {
		return availabilityRepository.save(entity);
	}

	@Override
	public Availability update(Availability entity) throws Exception {
		return availabilityRepository.save(entity);
	}

	@Override
	public void delete(Availability entity) throws Exception {
		availabilityRepository.delete(entity);
	}

	@Override
	public void validate(Availability entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		return availabilityRepository.count();
	}

	@Override
	public Optional<Availability> findBy(String id) {
		return availabilityRepository.findById(id);
	}

	@Override
	public void deleteById(String id) throws Exception {
		availabilityRepository.deleteById(id);
	}



}
