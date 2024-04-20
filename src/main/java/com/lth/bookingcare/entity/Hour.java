package com.lth.bookingcare.entity;

import jakarta.persistence.*;

@Entity
public class Hour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String name;

    public Hour(String name) {
        this.name = name;
    }
}
