package com.lth.bookingcare.entity;

import jakarta.persistence.*;

@Entity
public class Contact {
    // Attribute
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String name;

    @Column(length = 100)
    private String dob;

    @Column(length = 100)
    private String phone;

    @Column(length = 50)
    private String gmail;

    @Column(length = 255)
    private String note;
    // Constructor

    public Contact() {
    }

    public Contact(Long id, String name, String dob, String phone, String gmail, String note) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.phone = phone;
        this.gmail = gmail;
        this.note = note;
    }
    // Getter and setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
