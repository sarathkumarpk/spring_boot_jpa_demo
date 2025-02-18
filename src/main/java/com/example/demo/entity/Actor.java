package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Actor {

@Id
private int actorId;

@Column(name = "first_name")
private String firstName;

@Column(name = "last_name")
private String lastName;

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getActorId() {
	return actorId;
}

public void setActorId(int actorId) {
	this.actorId = actorId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

}
