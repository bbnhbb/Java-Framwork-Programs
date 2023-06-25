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
    //    service.fetchVaccineByCompany("bharath bio tech").forEach(System.out::println);

    //    PG2
    //    service.fetchVaccineByPriceLessThan(650.0).forEach(System.out::println);

    //    PG3
    //    ArrayList<String> countries = new ArrayList<>();
    //    countries.add("IND");
    //    countries.add("USA");
    //    service.searchByContriesAndPriceRange(countries, 500D, 1000D);

    //    PG4
    //    ArrayList<String> countries = new ArrayList<>();
    //    countries.add("IND");
    //    countries.add("USA");
    //    service.findVacineNotByContries(countries).forEach(System.out::println);

    ((ConfigurableApplicationContext) factory).close();
  }
}
