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

import com.southpark.domain.Booking;
import com.southpark.service.BookingService;

@RestController
@RequestMapping("/booking")
@CrossOrigin("*")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/addBooking")
	public Booking postDetails(@RequestBody Booking booking) throws Exception {
		return bookingService.save(booking);
	}
	
	@GetMapping("/all")
	public List<Booking> findAll(){
	    return bookingService.findAll();
	}
	
	@GetMapping("/find/{id}")
	public Optional<Booking> findById(@PathVariable String id) {
		return bookingService.findBy(id);
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) throws Exception {
	    Optional<Booking> bookingOptional = bookingService.findBy(id);
	    
	    if (bookingOptional.isPresent()) {
	    	bookingService.deleteById(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}

}
