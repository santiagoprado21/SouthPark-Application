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

import com.southpark.domain.ActivityDetails;
import com.southpark.service.ActivityDetailsService;

@RestController
@RequestMapping("/activitydetails")
public class ActivityDetailsController {
	
	@Autowired
	private ActivityDetailsService activityDetailsService;
	
	@PostMapping("/addActivityDetail")
	public ActivityDetails postDetails(@RequestBody ActivityDetails activityDetails) throws Exception {
		return activityDetailsService.save(activityDetails);
	}
	
	@GetMapping("/all")
	public List<ActivityDetails> findAll(){
	    return activityDetailsService.findAll();
	}
	
	@GetMapping("/find/{id}")
	public Optional<ActivityDetails> findById(@PathVariable String id) {
		return activityDetailsService.findBy(id);
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) throws Exception {
	    Optional<ActivityDetails> activityDetailsOptional = activityDetailsService.findBy(id);
	    
	    if (activityDetailsOptional.isPresent()) {
	    	activityDetailsService.deleteById(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}

}