package org.example.Model;

import jakarta.persistence.Embeddable;

@Embeddable
public class ProgramId {
  private Integer prgmId;
  private Integer pId;

  public ProgramId(Integer prgmId, Integer pId) {
    this.prgmId = prgmId;
    this.pId = pId;
  }

  public ProgramId() {}
}
