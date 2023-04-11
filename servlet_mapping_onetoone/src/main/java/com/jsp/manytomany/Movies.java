package com.jsp.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Movies {
	@Id
	private int id;
	private String mName;
	private double budget;
	@ManyToMany(mappedBy = "movies")
	@JoinTable
	private List<Directors> directors;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public List<Directors> getDirectors() {
		return directors;
	}
	public void setDirectors(List<Directors> directors) {
		this.directors = directors;
	}
	
}
