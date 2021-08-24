package com.applicar.escolares.jpa.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private String name;
    private String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName(){
        return name + ' ' + lastName;
    }

    public Student(String name, String lastName){
        super();
        this.name = name;
        this.lastName = lastName;
    }

    public Student(){
        super();
    }
}