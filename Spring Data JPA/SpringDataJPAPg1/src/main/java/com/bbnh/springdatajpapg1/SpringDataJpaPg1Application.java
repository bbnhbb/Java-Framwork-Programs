package com.bbnh.springdatajpapg1;

import com.bbnh.springdatajpapg1.BO.CoronaVaccine;
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
    CoronaVaccine coronaVaccine =
        new CoronaVaccine(null, "covaxin", "Bharath-biotech", "IND", 235.0, 3);
    String s = service.registerVacine(coronaVaccine);
    System.out.println(s);
    ((ConfigurableApplicationContext) factory).close();
  }
}
