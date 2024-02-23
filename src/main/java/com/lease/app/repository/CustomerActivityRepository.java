package com.lease.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lease.app.model.CustomerActivity;

@Repository
public interface CustomerActivityRepository extends JpaRepository<CustomerActivity, Long> {
	
	List<CustomerActivity> findBySiteContaining(String site);
	
}
