package com.lease.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lease.app.model.CustomerActivity;
import com.lease.app.repository.CustomerActivityRepository;

@RestController
@RequestMapping("api/customer_activity")
public class CustomerActivityController {
	
	@Autowired
	private CustomerActivityRepository customerActivityRepo;
	
	@GetMapping("/all")
	public ResponseEntity<CustomerActivity> getAllCustomerActivity(@RequestParam(required = false) String site){
		return null;
	}
	
}
