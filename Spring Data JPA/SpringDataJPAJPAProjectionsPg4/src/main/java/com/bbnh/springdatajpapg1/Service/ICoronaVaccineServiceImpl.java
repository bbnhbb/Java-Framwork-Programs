package com.bbnh.springdatajpapg1.Service;

import com.bbnh.springdatajpapg1.DTO.ICaronaVaccineRepo;
import com.bbnh.springdatajpapg1.Types.ResultView;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ICoronaVaccineServiceImpl {

  @Autowired private ICaronaVaccineRepo repo;

  public List<ResultView> searchVaccineByStartPrice(Double price) {
    //    System.out.println(repo.getClass().getName());
    return repo.findByPriceGreaterThanEqualOrderByPrice(price);
  }
}
