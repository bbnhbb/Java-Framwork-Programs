package com.bbnh.springdatajpapg1.Service;

import com.bbnh.springdatajpapg1.BO.CoronaVaccine;
import com.bbnh.springdatajpapg1.DTO.ICaronaVaccineRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ICoronaVaccineServiceImpl {

  @Autowired private ICaronaVaccineRepo repo;

  public List<CoronaVaccine> fetchVaccineByCompany(String company) {
    List<CoronaVaccine> listEntities = repo.findByCompany(company);
    return listEntities;
  }

  public List<CoronaVaccine> fetchVaccineByPriceLessThan(Double price) {
    List<CoronaVaccine> listEnities = repo.findByPriceLessThan(price);
    return listEnities;
  }

  public List<CoronaVaccine> searchByContriesAndPriceRange(
      List<String> countries, double startRange, double endRange) {
    List<CoronaVaccine> byCountryInAndPriceBetween =
        repo.findByCountryInAndPriceBetween(countries, startRange, endRange);
    return byCountryInAndPriceBetween;
  }

  public List<CoronaVaccine> findVacineNotByContries(List<String> countries) {
    return repo.findByCountryNotIn(countries);
  }
}
