package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "film")
public class Film {

@Id
@Column(name = "film_id")
private int filmId;

public int getFilmId() {
	return filmId;
}

public void setFilmId(int filmId) {
	this.filmId = filmId;
}

@Column(name = "title")
private String title;

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}
	
}
