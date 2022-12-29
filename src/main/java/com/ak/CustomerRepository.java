package com.ak;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CustomerRepository
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
    
}