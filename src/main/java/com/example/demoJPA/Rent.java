package com.example.demoJPA;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Rent {

    private long id;
    private Date begin;
    private Date end;
    private Person person;
    private List<Vehicule> vehicules = new ArrayList<>();
    public Rent() {
        super();
    }

    public Rent(Date begin, Date end) {
        super();
        this.begin = begin;
        this.end = end;
    }
    @ManyToOne
    public Person getPerson(){
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @OneToMany(mappedBy = "rent")
    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    public void setVehicules(List<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date beginrent) {
        this.begin = beginrent;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date endrent) {
        this.end = endrent;
    }
}
