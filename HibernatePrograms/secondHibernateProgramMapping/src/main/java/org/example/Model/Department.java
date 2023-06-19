package org.example.Model;

import jakarta.persistence.*;
import java.util.Set;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
public class Department {
  @Id private String deptId;

  private String deptName;

  @OneToMany(cascade = CascadeType.ALL)
  private Set<EmployeeDept> employees;
}
