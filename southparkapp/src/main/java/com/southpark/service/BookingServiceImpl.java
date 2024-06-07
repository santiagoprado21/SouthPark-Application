package com.southpark.service;

import java.util.List;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.southpark.domain.Booking;

import com.southpark.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	private BookingRepository bookingRepository;
	
	@Override
	public List<Booking> findAll() {
		List<Booking> lstBooking = bookingRepository.findAll();
		return lstBooking;
	}

	@Override
	public Optional<Booking> findBy(String id) {
		return bookingRepository.findById(id);
	}

	@Override
	public Booking save(Booking entity) throws Exception {
		return bookingRepository.save(entity);
	}


	@Override
	public Booking update(Booking entity) throws Exception {
		return bookingRepository.save(entity);
	}

	@Override
	public void delete(Booking entity) throws Exception {
		bookingRepository.delete(entity);
	}

	@Override
	public void deleteById(String id) throws Exception {
		bookingRepository.deleteById(id);
	}

	@Override
	public void validate(Booking entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		return bookingRepository.count();
	}

}
