package com.airbnb.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airbnb.Model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{

	Optional<Customer> findById(String customerid);
	
}
