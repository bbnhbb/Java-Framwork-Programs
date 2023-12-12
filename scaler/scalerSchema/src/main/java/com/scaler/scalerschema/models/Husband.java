package com.scaler.scalerschema.models;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Husband extends BaseModel {
    @OneToOne
    private Wife wife;
}
