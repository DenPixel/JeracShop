package com.denpixel.jeracshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Ring extends Jewel {
    @Column(name = "size", nullable = false)
    private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
