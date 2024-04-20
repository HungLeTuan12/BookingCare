package com.lth.bookingcare.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Major {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100)
    private String name;
    @Column(length = 100)
    private String avatar;
    @Column(length = 64)
    private String idImage;
    @Column(length = 255)
    private String description;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "major")
    private List<User> users = new ArrayList<>();

    // Constructor

    public Major() {
    }

    public Major(Long id, String name, String avatar, String idImage, String description, List<User> users) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.idImage = idImage;
        this.description = description;
        this.users = users;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getIdImage() {
        return idImage;
    }

    public void setIdImage(String idImage) {
        this.idImage = idImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
