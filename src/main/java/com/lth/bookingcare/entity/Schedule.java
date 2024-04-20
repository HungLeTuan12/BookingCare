package com.lth.bookingcare.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;

    @OneToOne
    private Hour hour;

    @OneToMany(mappedBy = "schedule",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
    private List<ScheduleUser> listUser = new ArrayList<>();

    public Schedule(Date date, Hour hour) {
        this.date = date;
        this.hour = hour;
    }

    public Schedule() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Hour getHour() {
        return hour;
    }

    public void setHour(Hour hour) {
        this.hour = hour;
    }

    public List<ScheduleUser> getListUser() {
        return listUser;
    }

    public void setListUser(List<ScheduleUser> listUser) {
        this.listUser = listUser;
    }
}
