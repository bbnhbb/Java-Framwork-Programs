package org.example.Model;

import jakarta.persistence.*;
import java.util.Set;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
@Entity
public class Student {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Integer sid;

  @NonNull private String sname;
  @NonNull private String address;

  @NonNull
  @ManyToMany(cascade = CascadeType.ALL)
  private Set<Course> courses;
}
