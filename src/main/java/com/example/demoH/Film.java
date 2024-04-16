package com.example.demoH;

import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Film {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String title;

@ManyToOne
@JoinColumn(name="actor_id")
private Actor actor;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Actor getActor(){
	return actor;
}
public void setActor(Actor actor) {
	this.actor=actor;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
}
