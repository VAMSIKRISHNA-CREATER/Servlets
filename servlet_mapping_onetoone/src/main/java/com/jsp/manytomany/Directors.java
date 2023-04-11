package com.jsp.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Directors {
	@Id
	private int id;
	private String dName;
	private int age;
	@ManyToMany
	private List<Movies> movies;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Movies> getMovie() {
		return movies;
	}
	public void setMovie(List<Movies> movies) {
		this.movies = movies;
	}
}
