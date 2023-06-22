package com.bbnh.springdatajpapg1.Service;

import com.bbnh.springdatajpapg1.BO.CoronaVaccine;
import com.bbnh.springdatajpapg1.DTO.ICaronaVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ICoronaVaccineServiceImpl {

  @Autowired private ICaronaVaccineRepo repo;

  public Iterable<CoronaVaccine> fetchDetails(boolean asc, String... propeties) {
    Sort sort = Sort.by(asc ? Sort.Direction.ASC : Sort.Direction.DESC, propeties);
    Iterable<CoronaVaccine> vaccines = repo.findAll(sort);

    return vaccines;
  }

  public Iterable<CoronaVaccine> fetchDetailsByPageNo(
      int pageNo, int pageSize, boolean asc, String... properties) {
    Pageable pageable =
        PageRequest.of(
            pageNo, pageSize, asc ? Sort.Direction.ASC : Sort.Direction.DESC, properties);
    Page<CoronaVaccine> page = repo.findAll(pageable);
    return page.getContent();
  }

  public void fetchDetailsByPagination(int pageSize) {
    long count = repo.count(); // 7
    long pagesCount = count / pageSize; // 7/3 = 2...
    pagesCount = count % pageSize == 0 ? pagesCount : ++pagesCount; // 3
    for (int i = 0; i < pagesCount; i++) {
      Pageable pageable = PageRequest.of(i, pageSize);
      Page<CoronaVaccine> page = repo.findAll(pageable);
      page.getContent().forEach(System.out::println);
    }
  }
}
