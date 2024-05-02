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

import com.southpark.domain.Activity;
import com.southpark.service.ActivityService;

@RestController
@RequestMapping("/activities")
@CrossOrigin("*")
public class ActivityController {
	
	@Autowired
	private ActivityService activityService;
	
	@PostMapping("/addActivity")
	public Activity postDetails(@RequestBody Activity activity) throws Exception {
		return activityService.save(activity);
	}
	
	@GetMapping("/all")
	public List<Activity> getAll(){
		return activityService.findAll();
	}
	
	@GetMapping("/find/{id}")
	public Optional<Activity> findById(@PathVariable String id) {
		return activityService.findBy(id);
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) throws Exception {
	    Optional<Activity> activityOptional = activityService.findBy(id);
	    
	    if (activityOptional.isPresent()) {
	    	activityService.deleteById(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
	

}
