package com.denpixel.jeracshop.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Insert {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "name_stone", nullable = false)
    private Stone nameStone;

    @Column(name = "count_stone", nullable = false)
    private int countStone;

    @Column(name = "weight", nullable = false)
    private double weight;

    @ManyToOne
    @JoinColumn(name = "ring_id")
    private Ring ring;

    @ManyToOne
    @JoinColumn(name = "earring_id")
    private Earring earring;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Stone getNameStone() {
        return nameStone;
    }

    public void setNameStone(Stone nameStone) {
        this.nameStone = nameStone;
    }

    public int getCountStone() {
        return countStone;
    }

    public void setCountStone(int countStone) {
        this.countStone = countStone;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Ring getRing() {
        return ring;
    }

    public void setRing(Ring ring) {
        this.ring = ring;
    }

    public Earring getEarring() {
        return earring;
    }

    public void setEarring(Earring earring) {
        this.earring = earring;
    }
}
