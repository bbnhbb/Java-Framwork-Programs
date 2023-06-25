package com.bbnh.springdatajpapg1;

import com.bbnh.springdatajpapg1.BO.Customer;
import com.bbnh.springdatajpapg1.Service.ICustomerMgmtService;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJpaPg1Application {

  public static void main(String[] args) {

    ApplicationContext factory = SpringApplication.run(SpringDataJpaPg1Application.class, args);

    ICustomerMgmtService service = factory.getBean(ICustomerMgmtService.class);

    //    save customer
    Customer customer =
        new Customer(
            null,
            "sachin",
            "MI",
            LocalDateTime.of(1983, 4, 24, 15, 0, 12),
            LocalTime.of(10, 45),
            LocalDate.now());
    Customer customer1 =
        new Customer(
            null,
            "Dhoni",
            "CSK",
            LocalDateTime.of(1983, 4, 24, 15, 0, 12),
            LocalTime.of(10, 45),
            LocalDate.now());
    Customer customer2 =
        new Customer(
            null,
            "Kohli",
            "RCB",
            LocalDateTime.of(1983, 4, 24, 15, 0, 12),
            LocalTime.of(10, 45),
            LocalDate.now());

    String status = service.registerCustomer(customer);
    System.out.println(status);
    String status1 = service.registerCustomer(customer1);
    System.out.println(status1);
    String status3 = service.registerCustomer(customer2);
    System.out.println(status3);

    System.out.println("");

    //    Retrieving the customers
    List<Customer> allCustomers = service.getAllCustomers();

    allCustomers.forEach(System.out::println);

    ((ConfigurableApplicationContext) factory).close();
  }
}
