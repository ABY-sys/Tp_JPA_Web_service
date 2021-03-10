package com.example.demoJPA;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
    public class Person {

        private long id;
        private String name;
        private int age;
       private List<Rent> rents =new ArrayList<>();

        public Person() {
            super();
        }

        public Person(String name, int age) {
            super();
            this.name = name;
            this.age = age;
        }
@OneToMany(mappedBy = "person")
    public List<Rent> getRents() {
        return rents;
    }

    public void setRents(List<Rent> rents) {
        this.rents = rents;
    }

    @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        public long getId() {
            return id;
        }
        public void setId(long id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

