package com.bbnh.springdatajpapg1.DTO;

import com.bbnh.springdatajpapg1.BO.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {}
