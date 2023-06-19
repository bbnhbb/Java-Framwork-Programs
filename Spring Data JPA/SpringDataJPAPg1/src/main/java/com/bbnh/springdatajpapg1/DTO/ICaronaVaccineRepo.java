package com.bbnh.springdatajpapg1.DTO;

import com.bbnh.springdatajpapg1.BO.CoronaVaccine;
import org.springframework.data.repository.CrudRepository;

public interface ICaronaVaccineRepo extends CrudRepository<CoronaVaccine, Long> {}
