package com.bbnh.springdatajpapg1.Service;

import com.bbnh.springdatajpapg1.DTO.ICaronaVaccineRepo;
import com.bbnh.springdatajpapg1.Types.View;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ICoronaVaccineServiceImpl {

  @Autowired private ICaronaVaccineRepo repo;

  public <T extends View> List<T> searchVaccineByCompany(String company, Class<T> clazz) {
    return repo.findByCompanyOrderByCompanyDesc(company, clazz);
  }
}
