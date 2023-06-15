package org.example.Model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Product {
  @EmbeddedId private ProgramId prmId;
  private String name;
  private String price;

  public ProgramId getPrmId() {
    return prmId;
  }

  public String getName() {
    return name;
  }

  public String getPrice() {
    return price;
  }

  public void setPrmId(ProgramId prmId) {
    this.prmId = prmId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(String price) {
    this.price = price;
  }
}
