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

import com.southpark.domain.Availability;
import com.southpark.service.AvailabilityService;

@RestController
@RequestMapping("/availability")
@CrossOrigin("*")
public class AvailabilityController {
	
	@Autowired
	private AvailabilityService availabilityService;
	
	
	@PostMapping("/addAvailability")
	public Availability postDetails(@RequestBody Availability availability) throws Exception {
		return availabilityService.save(availability);
	}
	
	@GetMapping("/all")
	public List<Availability> findAll(){
	    return availabilityService.findAll();
	}
	
	@GetMapping("/find/{id}")
	public Optional<Availability> findById(@PathVariable String id) {
		return availabilityService.findBy(id);
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) throws Exception {
	    Optional<Availability> availabilityOptional = availabilityService.findBy(id);
	    
	    if (availabilityOptional.isPresent()) {
	    	availabilityService.deleteById(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}

}
