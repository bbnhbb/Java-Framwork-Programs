package com.bbnh.springdatajpapg1.DTO;

import com.bbnh.springdatajpapg1.BO.CoronaVaccine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICaronaVaccineRepo extends JpaRepository<CoronaVaccine, Long> {}
