package com.bbnh.springdatajpapg1;

import com.bbnh.springdatajpapg1.Service.ICoronaVaccineServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJpaPg1Application {

  public static void main(String[] args) {

    ApplicationContext factory = SpringApplication.run(SpringDataJpaPg1Application.class, args);

    ICoronaVaccineServiceImpl service = factory.getBean(ICoronaVaccineServiceImpl.class);

    //    PG1
    // Sorting by asc or desc passing the properties
    //    Iterable<CoronaVaccine> vaccines = service.fetchDetails(true, "price", "name");
    //    vaccines.forEach((vaccine) -> System.out.println(vaccine));

    //  PG2
    //    Sorting by page no
    //    service
    //        .fetchDetailsByPageNo(0, 5, true, "price", "name")
    //        .forEach((vaccine) -> System.out.println(vaccine.getPrice() + " " +
    // vaccine.getCountry()));

    //    PG3
    service.fetchDetailsByPagination(3);
    ((ConfigurableApplicationContext) factory).close();
  }
}
