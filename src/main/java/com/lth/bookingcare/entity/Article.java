package com.lth.bookingcare.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
public class Article {
    // Attribute
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String title;

    private String content;

    @Column(length = 128)
    private String image;

    @Column(length = 64)
    private String url_id;

    @UpdateTimestamp
    private LocalDateTime update_at;

    @CreationTimestamp
    private LocalDateTime create_at;

    @ManyToOne
    private User user;
    // Constructor

    public Article() {
    }

    public Article(Long id, String title, String content, String image, String url_id, LocalDateTime update_at, LocalDateTime create_at, User user) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.image = image;
        this.url_id = url_id;
        this.update_at = update_at;
        this.create_at = create_at;
        this.user = user;
    }
    // Getter and setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl_id() {
        return url_id;
    }

    public void setUrl_id(String url_id) {
        this.url_id = url_id;
    }

    public LocalDateTime getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(LocalDateTime update_at) {
        this.update_at = update_at;
    }

    public LocalDateTime getCreate_at() {
        return create_at;
    }

    public void setCreate_at(LocalDateTime create_at) {
        this.create_at = create_at;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
