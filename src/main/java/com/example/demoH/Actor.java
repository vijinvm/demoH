package com.example.demoH;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Actor {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;

@OneToMany(mappedBy="actor",cascade=CascadeType.ALL)
private List<Film>films;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public List<Film>getFilm(){
	return films;
}
public void setFilms(List<Film>films) {
	this.films=films;
}
}
