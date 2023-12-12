package com.scaler.scalerschema.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class ModuleExam extends BaseModel {

    @ManyToOne
    private Module module;

    @ManyToOne
    private Exam exam;
    private Date dateOfExam;
}
