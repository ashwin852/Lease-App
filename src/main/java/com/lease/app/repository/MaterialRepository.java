package com.lease.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lease.app.model.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {
	
	List<Material> findByNameContaining(String name);
	
}
