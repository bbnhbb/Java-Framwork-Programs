package com.scaler.scalerschema.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class StudentModuleExam extends BaseModel {

    @ManyToOne
    private Student student;

    @ManyToOne
    private ModuleExam moduleExam;

    private int marks;
}
