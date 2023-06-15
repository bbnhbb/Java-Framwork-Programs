package org.example.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "empTab")
public class Employee {

  @Id
  @Column(name = "eid")
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer empId;

  @Column(name = "ename")
  private String empName;

  @Column(name = "esal")
  private Double empSal;

  public Employee() {
    System.out.println("Inside 0 arg constructor");
  }

  public int getEmpId() {
    System.out.println("Inside getEmpID()");
    return empId;
  }

  public String getEmpName() {
    System.out.println("Inside getEmpName()");
    return empName;
  }

  public Double getEmpSal() {
    System.out.println("Inside getEmpSal()");
    return empSal;
  }

  public void setEmpId(int empId) {
    System.out.println("Inside setEmpId()");
    this.empId = empId;
  }

  public void setEmpName(String empName) {
    System.out.println("Inside setEmpName()");
    this.empName = empName;
  }

  public void setEmpSal(Double empSal) {
    System.out.println("Inside setEmpSal()");
    this.empSal = empSal;
  }
}
