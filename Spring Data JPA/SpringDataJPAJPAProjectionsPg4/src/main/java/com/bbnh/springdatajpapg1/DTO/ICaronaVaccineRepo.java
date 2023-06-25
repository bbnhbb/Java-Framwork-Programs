package com.bbnh.springdatajpapg1.DTO;

import com.bbnh.springdatajpapg1.BO.CoronaVaccine;
import com.bbnh.springdatajpapg1.Types.ResultView;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICaronaVaccineRepo extends JpaRepository<CoronaVaccine, Long> {
  public List<ResultView> findByPriceGreaterThanEqualOrderByPrice(Double price);
}
