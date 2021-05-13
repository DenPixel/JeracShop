package com.denpixel.jeracshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Earring extends Jewel {
    @Column(name = "clasp", nullable = false)
    private String clasp;

    public String getClasp() {
        return clasp;
    }

    public void setClasp(String clasp) {
        this.clasp = clasp;
    }
}
