package org.example.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Entity
public class Course {
  @Id private String cid;
  private String cname;
  private Integer cost;
}
