package com.example.demo.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Entity
@Table(name = "film")
public class Film {

    @Id
    @Column(name = "film_id")
    private int filmId;

    @Column(name = "title")
    private String title;

}
