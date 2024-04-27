package com.southpark.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.southpark.domain.CancelationBooking;
import com.southpark.service.CancelationBookingService;


@RestController
@RequestMapping("/cancelationBooking")
public class CancelationBookingController {
	
	@Autowired
	private CancelationBookingService cancelationBookingService;

	@PostMapping("/addBooking")
	public CancelationBooking postDetails(@RequestBody CancelationBooking cancelationBooking) throws Exception {
		return cancelationBookingService.save(cancelationBooking);
	}
	
	@GetMapping("/all")
	public List<CancelationBooking> findAll(){
	    return cancelationBookingService.findAll();
	}
	
	@GetMapping("/find/{id}")
	public Optional<CancelationBooking> findById(@PathVariable String id) {
		return cancelationBookingService.findBy(id);
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) throws Exception {
	    Optional<CancelationBooking> clientOptional = cancelationBookingService.findBy(id);
	    
	    if (clientOptional.isPresent()) {
	    	cancelationBookingService.deleteById(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
	
}
