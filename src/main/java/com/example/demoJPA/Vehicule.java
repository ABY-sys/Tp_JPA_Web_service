package com.example.demoJPA;

import javax.persistence.*;

@Entity
public class Vehicule {
    private int platenumber;
    private String id;
    private Rent rent;

    public Vehicule(){
        super();
    }
    public Vehicule(int platenumber) {
        super();
        this.platenumber = platenumber;
    }

    public int getPlatenumber() {
        return platenumber;
    }

    public void setPlatenumber(int platenumber) {
        this.platenumber = platenumber;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne
    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    @Id
    public String getId() {
        return id;
    }
}
