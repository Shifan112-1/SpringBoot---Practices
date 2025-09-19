package com.luv2code.cruddemo.entity;

import jakarta.persistence.*;

// we map this class to a database using jsp
@Entity
@Table(name="Student")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstname;

    @Column(name="last_name")
    private String lastname;

    //@Column(name="em")
    private String email;

    // we have 2 constructors here

    public Student() {}

    public Student(String firstnam, String lastname, String email) {
        this.firstname = firstnam;
        this.lastname = lastname;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "id: " + id +" name: " +  firstname + " " + lastname +  " email: " + email + "\n";
    }
}
