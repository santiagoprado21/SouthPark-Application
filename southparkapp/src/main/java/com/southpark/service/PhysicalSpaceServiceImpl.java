package com.southpark.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.southpark.domain.PhysicalSpace;
import com.southpark.repository.PhysicalSpaceRepository;


public class PhysicalSpaceServiceImpl implements PhysicalSpaceService{

	
	@Autowired
	private PhysicalSpaceRepository physicalSpaceRepository;
	
	
	@Override
	public List<PhysicalSpace> findAll() {
		List<PhysicalSpace> lstActivityDetails = physicalSpaceRepository.findAll();
		return lstActivityDetails;
	}

	@Override
	public Optional<PhysicalSpace> findBy(String id) {
		return physicalSpaceRepository.findById(id);
	}

	@Override
	public PhysicalSpace save(PhysicalSpace entity) throws Exception {
		return physicalSpaceRepository.save(entity);
	}

	@Override
	public PhysicalSpace update(PhysicalSpace entity) throws Exception {
		return physicalSpaceRepository.save(entity);
	}

	@Override
	public void delete(PhysicalSpace entity) throws Exception {
		physicalSpaceRepository.delete(entity);
	}

	@Override
	public void deleteById(String id) throws Exception {
		physicalSpaceRepository.deleteById(id);
	}

	@Override
	public void validate(PhysicalSpace entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		return physicalSpaceRepository.count();
	}

}
