package org.example.Model;

import jakarta.persistence.*;
import lombok.*;

@RequiredArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class EmployeeDept {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer eid;

  @NonNull private String ename;
  @NonNull private Float salary;
  @NonNull private String eaddress;

  public EmployeeDept() {}
}
