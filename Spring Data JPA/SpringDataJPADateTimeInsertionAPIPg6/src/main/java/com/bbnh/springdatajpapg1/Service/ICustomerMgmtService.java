package com.bbnh.springdatajpapg1.Service;

import com.bbnh.springdatajpapg1.BO.Customer;
import com.bbnh.springdatajpapg1.DTO.CustomerRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("service")
public class ICustomerMgmtService {
  @Autowired private CustomerRepo repo;

  public String registerCustomer(Customer customer) {
    Integer cid = repo.save(customer).getCid();
    return "customer saved with the id :: " + cid;
  }

  public List<Customer> getAllCustomers() {
    List<Customer> all = (List<Customer>) repo.findAll();
    return all;
  }
}
