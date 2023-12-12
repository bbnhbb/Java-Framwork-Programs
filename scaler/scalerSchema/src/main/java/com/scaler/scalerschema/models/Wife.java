package com.scaler.scalerschema.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Wife extends BaseModel {
    @OneToOne
    private Husband husband;
}
