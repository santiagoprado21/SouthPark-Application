package com.southpark.service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.southpark.domain.CancelationBooking;

import com.southpark.repository.CancelationBookingRepository;

@Service
public class CancelationBookingServiceImpl implements CancelationBookingService{

	@Autowired
	private CancelationBookingRepository cancelationBookingRepository;
	
	@Override
	public List<CancelationBooking> findAll() {
		List<CancelationBooking> lstCancelationBooking = cancelationBookingRepository.findAll();
		return lstCancelationBooking;
	}

	@Override
	public Optional<CancelationBooking> findBy(String id) {
		return cancelationBookingRepository.findById(id);
	}

	@Override
	public CancelationBooking save(CancelationBooking entity) throws Exception {
		return cancelationBookingRepository.save(entity);
	}

	@Override
	public CancelationBooking update(CancelationBooking entity) throws Exception {
		return cancelationBookingRepository.save(entity);
	}

	@Override
	public void delete(CancelationBooking entity) throws Exception {
		cancelationBookingRepository.delete(entity);;
	}

	@Override
	public void deleteById(String id) throws Exception {
		cancelationBookingRepository.deleteById(id);
	}

	@Override
	public void validate(CancelationBooking entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		return cancelationBookingRepository.count();
	}

}
