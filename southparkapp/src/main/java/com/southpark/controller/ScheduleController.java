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

import com.southpark.domain.Schedule;
import com.southpark.service.ScheduleService;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

	@Autowired
	private ScheduleService scheduleService;
	
	@PostMapping("/addClient")
	public Schedule postDetails(@RequestBody Schedule schedule) throws Exception {
		return scheduleService.save(schedule);
	}
	
	@GetMapping("/all")
	public List<Schedule> findAll(){
	    return scheduleService.findAll();
	}
	
	@GetMapping("/find/{id}")
	public Optional<Schedule> findById(@PathVariable String id) {
		return scheduleService.findBy(id);
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) throws Exception {
	    Optional<Schedule> scheduleOptional = scheduleService.findBy(id);
	    
	    if (scheduleOptional.isPresent()) {
	    	scheduleService.deleteById(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
	
}
