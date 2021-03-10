package com.example.demoJPA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Van {
    private long id;
    private int maxweight;


    public Van() {
        super();
    }

    public Van(int maxweight) {
        super();
        this.maxweight = maxweight;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMaxweight() {
        return maxweight;
    }

    public void setMaxweight(int maxweight) {
        this.maxweight = maxweight;
    }
}
