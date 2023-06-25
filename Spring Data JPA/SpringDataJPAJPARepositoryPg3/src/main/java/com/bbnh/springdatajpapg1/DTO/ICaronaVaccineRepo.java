package com.bbnh.springdatajpapg1.DTO;

import com.bbnh.springdatajpapg1.BO.CoronaVaccine;
import java.util.Collection;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICaronaVaccineRepo extends JpaRepository<CoronaVaccine, Long> {

  public List<CoronaVaccine> findByCompany(String company);

  public List<CoronaVaccine> findByPriceLessThan(Double price);

  public List<CoronaVaccine> findByCountryInAndPriceBetween(
      Collection<String> countries, double startRange, double endRange);

  public List<CoronaVaccine> findByCountryNotIn(Collection<String> countries);
}
