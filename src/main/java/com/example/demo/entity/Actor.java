package com.example.demo.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Entity
public class Actor {

@Id
private int actorId;

@Column(name = "first_name")
private String firstName;

@Column(name = "last_name")
private String lastName;

}
