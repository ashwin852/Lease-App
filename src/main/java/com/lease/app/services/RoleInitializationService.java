package com.lease.app.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lease.app.model.ERole;
import com.lease.app.model.Role;
import com.lease.app.repository.RoleRepository;

import jakarta.annotation.PostConstruct;

@Service
public class RoleInitializationService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@PostConstruct
	public void initializeRole() {
		Arrays.stream(ERole.values())
			.forEach(role -> {
				if(!roleRepository.existsByName(role)) {
					Role roleEntity = new Role();
					roleEntity.setName(role);
					roleRepository.save(roleEntity);
				}
			});
	}
	
}
