package com.bbnh.springdatajpapg1.Service;

import com.bbnh.springdatajpapg1.BO.CoronaVaccine;
import com.bbnh.springdatajpapg1.DTO.ICaronaVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ICoronaVaccineServiceImpl {
  @Autowired private ICaronaVaccineRepo repo;

  public String registerVacine(CoronaVaccine vaccine) {
    System.out.println("In memory proxy class is :: " + repo.getClass().getName());

    CoronaVaccine saveVaccine = null;

    if (vaccine != null) {
      saveVaccine = repo.save(vaccine);
    }

    return saveVaccine != null
        ? "vaccine registered successfully with " + saveVaccine.getRegNo()
        : "vaccine registraion failed";
  }
}
