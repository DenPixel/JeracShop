package com.denpixel.jeracshop.model;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@MappedSuperclass
public class Jewel {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "material", nullable = false)
    @Enumerated
    private Material material;

    @Column(name = "cost", nullable = false)
    private double cost;

    @Column(name = "assay", nullable = false)
    private int assay;

    @Column(name = "color", nullable = false)
    @Enumerated
    private Color color;

    @OneToMany
    private Set<Insert> inserts;

    @Column(name = "weight", nullable = false)
    private double weight;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAssay() {
        return assay;
    }

    public void setAssay(int content) {
        this.assay = content;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Set<Insert> getInserts() {
        return inserts;
    }

    public void setInserts(Set<Insert> inserts) {
        this.inserts = inserts;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
