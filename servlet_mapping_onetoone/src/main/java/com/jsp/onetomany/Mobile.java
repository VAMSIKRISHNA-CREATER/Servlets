package com.jsp.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Mobile {
	@Id
	private int id;
	private String bName;
	private int ram;
	@OneToMany
	private List<Sim> sims;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public List<Sim> getSims() {
		return sims;
	}
	public void setSims(List<Sim> sims) {
		this.sims = sims;
	}	
}
