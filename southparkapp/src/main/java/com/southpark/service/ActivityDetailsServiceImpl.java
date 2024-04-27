package com.southpark.service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.southpark.domain.ActivityDetails;
import com.southpark.repository.ActivityDetailsRepository;


@Service
public class ActivityDetailsServiceImpl implements ActivityDetailsService{

	@Autowired
	private ActivityDetailsRepository activityDetailsRepository;
	
	@Override
	public List<ActivityDetails> findAll() {
		List<ActivityDetails> lstActivityDetails = activityDetailsRepository.findAll();
		return lstActivityDetails;
	}

	@Override
	public Optional<ActivityDetails> findBy(String id) {
		
		return activityDetailsRepository.findById(id);
	}
	
	@Override
	public ActivityDetails save(ActivityDetails entity) throws Exception {
		return activityDetailsRepository.save(entity);
	}

	@Override
	public ActivityDetails update(ActivityDetails entity) throws Exception {
		return activityDetailsRepository.save(entity);
	}

	@Override
	public void delete(ActivityDetails entity) throws Exception {
		activityDetailsRepository.delete(entity);
	}

	@Override
	public void deleteById(String id) throws Exception {
		activityDetailsRepository.deleteById(id);
	}


	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return activityDetailsRepository.count();
	}

	@Override
	public void validate(ActivityDetails entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
