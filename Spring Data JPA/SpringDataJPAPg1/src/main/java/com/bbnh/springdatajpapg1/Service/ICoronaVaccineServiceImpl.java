package com.bbnh.springdatajpapg1.Service;

import com.bbnh.springdatajpapg1.BO.CoronaVaccine;
import com.bbnh.springdatajpapg1.DTO.ICaronaVaccineRepo;
import java.util.List;
import java.util.Optional;
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

  public Iterable<CoronaVaccine> registerInBatch(Iterable<CoronaVaccine> vaccines) {
    if (vaccines != null) return repo.saveAll(vaccines);
    else throw new IllegalArgumentException("Bacth insertion not done ....");
  }

  public Boolean checkAvailablityByRegNo(Long reqNo) {
    return repo.existsById(reqNo);
  }

  public Iterable<CoronaVaccine> fetchAllDetails() {
    return repo.findAll();
  }

  public Iterable<CoronaVaccine> fetchAllDetailsById(List<Long> ids) {
    return repo.findAllById(ids);
  }

  public CoronaVaccine fetchDetailsById(Long id) {
    Optional<CoronaVaccine> optl = repo.findById(id);
    if (!optl.isPresent()) optl.orElseThrow(() -> new IllegalArgumentException("record not found"));

    return optl.get();
  }

  public String removeVaccineById(Long id) {
    Optional<CoronaVaccine> optional = repo.findById(id);
    if (optional.isPresent()) {
      repo.deleteById(id);
      return "record deleted having id::" + id;
    }
    return "record not available for deletion with the id:: " + id;
  }

  public String removevaccineByObject(CoronaVaccine vacine) {
    Optional<CoronaVaccine> optional = repo.findById(vacine.getRegNo());
    if (optional.isPresent()) {
      repo.delete(vacine);
      return "record deleted having id::" + vacine.getRegNo();
    }
    return "record not available for deletion with the id:: " + vacine.getRegNo();
  }

  public String removeVaccinesById(List<Long> ids) {

    Iterable<CoronaVaccine> listEntities = repo.findAllById(ids);
    int count = ids.size();
    if (count == ((List) listEntities).size()) {
      repo.deleteAllById(ids);
      return count + " no of ids are deleted...";
    }
    return "Problem in deleting records";
  }
}
