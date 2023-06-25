package com.bbnh.springdatajpapg1;

import com.bbnh.springdatajpapg1.Service.ICoronaVaccineServiceImpl;
import com.bbnh.springdatajpapg1.Types.ResultSet3;
import com.bbnh.springdatajpapg1.Types.ResultView1;
import com.bbnh.springdatajpapg1.Types.ResultView2;
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
        .searchVaccineByCompany("bharath bio tech", ResultView2.class)
        .forEach(
            view -> {
              System.out.println(view.getRegNo() + " " + view.getCountry() + " " + view.getPrice());
            });

    service
        .searchVaccineByCompany("bharath bio tech", ResultView1.class)
        .forEach(
            view -> {
              System.out.println(view.getName() + " " + view.getCompany());
            });

    service
        .searchVaccineByCompany("bharath bio tech", ResultSet3.class)
        .forEach(
            view -> {
              System.out.println(view.getName() + " " + view.getCompany() + " " + view.getPrice());
            });

    ((ConfigurableApplicationContext) factory).close();
  }
}
