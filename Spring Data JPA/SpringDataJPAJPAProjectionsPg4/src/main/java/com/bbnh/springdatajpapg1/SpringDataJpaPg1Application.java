package com.bbnh.springdatajpapg1;

import com.bbnh.springdatajpapg1.Service.ICoronaVaccineServiceImpl;
import java.util.Arrays;
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
    service
        .searchVaccineByStartPrice(700D)
        .forEach(
            vaccine -> {
              System.out.println(
                  vaccine.getClass().getName()
                      + " "
                      + Arrays.toString(vaccine.getClass().getDeclaredMethods()));
              System.out.println(vaccine.getName() + " " + vaccine.getCountry());
            });

    ((ConfigurableApplicationContext) factory).close();
  }
}
