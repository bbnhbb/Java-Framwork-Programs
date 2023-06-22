package com.bbnh.springdatajpapg1;

import com.bbnh.springdatajpapg1.BO.CoronaVaccine;
import com.bbnh.springdatajpapg1.Service.ICoronaVaccineServiceImpl;
import java.util.ArrayList;
import java.util.List;
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
    //    CoronaVaccine coronaVaccine =
    //        new CoronaVaccine(null, "covaxin", "Bharath-biotech", "IND", 235.0, 3);
    //    String s = service.registerVacine(coronaVaccine);
    //    System.out.println(s);

    //    PG2
    List<CoronaVaccine> vaccines = new ArrayList<>();
    vaccines.add(new CoronaVaccine(null, "sputnik", "russie", "Russia", 586.5, 2));
    vaccines.add(new CoronaVaccine(null, "pyzer", "pyzwer", "USSA", 800.5, 4));
    vaccines.add(new CoronaVaccine(null, "astrazenca", "moderena", "USA", 605.5, 4));
    vaccines.add(new CoronaVaccine(null, "Covacin", "bharath bio tech", "IND", 800.5, 2));
    vaccines.add(new CoronaVaccine(null, "Covi shild", "serum", "IND", 900.5, 2));
    service.registerInBatch(vaccines);

    //    PG3
    //    System.out.println(
    //        "Checking availability for the id::1 is => " + service.checkAvailablityByRegNo(1L));

    //    Pg4
    //    System.out.println(service.fetchAllDetails());

    //    Pg5
    //    List<Long> ids = new ArrayList<>();
    //    ids.add(1L);
    //    ids.add(2L);
    //    ids.add(3L);
    //    ids.add(4L);
    //
    //    System.out.println(service.fetchAllDetailsById(ids));

    //    Pg6
    //    System.out.println(service.fetchDetailsById(3L));

    //    Pg7
    //    CoronaVaccine coronaVaccine = new CoronaVaccine(3L, "pyzwer", "pyzer", "USSA", 800.5, 4);
    //    String s = service.removevaccineByObject(coronaVaccine);
    //    System.out.println(s);

    //    String s = service.removeVaccineById(10L);
    //    System.out.println(s);

    //    List<Long> ids = new ArrayList<>();
    //    ids.add(1L);
    //    ids.add(4L);
    //    String s = service.removeVaccinesById(ids);
    //    System.out.println(s);
    ((ConfigurableApplicationContext) factory).close();
  }
}
