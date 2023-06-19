package org.example.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.ToString;

@ToString
@Entity
public class Account {
  @Id private String accNo;
  private String accType;
  private String accName;

  static {
    System.out.println("Account Static block");
  }

  public Account() {
    System.out.println("Account No Arg constructor");
  }

  public String getAccNo() {
    return accNo;
  }

  public String getAccType() {
    return accType;
  }

  public String getAccName() {
    return accName;
  }

  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }

  public void setAccType(String accType) {
    this.accType = accType;
  }

  public void setAccName(String accName) {
    this.accName = accName;
  }
}
