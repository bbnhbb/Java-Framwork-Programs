package com.bbnh.springdatajpapg1.DTO;

import com.bbnh.springdatajpapg1.BO.CoronaVaccine;
import com.bbnh.springdatajpapg1.Types.View;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICaronaVaccineRepo extends JpaRepository<CoronaVaccine, Long> {
  public <T extends View> List<T> findByCompanyOrderByCompanyDesc(String company, Class<T> clazz);
}
