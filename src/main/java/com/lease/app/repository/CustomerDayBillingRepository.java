package com.lease.app.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lease.app.model.CustomerDayBilling;

@Repository
public interface CustomerDayBillingRepository extends JpaRepository<CustomerDayBilling, Long>{
	
	List<CustomerDayBilling> findByPhoneNoContaining(Long phoneNo);
	
}
