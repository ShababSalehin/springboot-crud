package com.jpa.test.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
public User(int id, String name, String city, String status) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.status = status;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String string) {
	this.name = string;
}
public String getCity() {
	return city;
}
public void setCity(String string) {
	this.city = string;
}
public String getStatus() {
	return status;
}
public void setStatus(String string) {
	this.status = string;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", city=" + city + ", status=" + status + "]";
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
private String city;
private String status;
}
