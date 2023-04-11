package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Person;

public class PersonDao {
	public Person savePerson(Person p) {
		EntityManagerFactory remf = Persistence.createEntityManagerFactory("god");
		EntityManager rem = remf.createEntityManager();
		EntityTransaction ret = rem.getTransaction();
		if(p!=null) {
			ret.begin();
			rem.persist(p);
			ret.commit();
		}
		return p;
	}
	@SuppressWarnings("unchecked")
	public List<Person> getAll(){
		EntityManagerFactory remf = Persistence.createEntityManagerFactory("god");
		EntityManager rem = remf.createEntityManager();
		Query qry = rem.createQuery("select a from Person a");
		return qry.getResultList();
	}
	public Person getById(int id) {
		EntityManagerFactory remf = Persistence.createEntityManagerFactory("god");
		EntityManager rem = remf.createEntityManager();
		return rem.find(Person.class,id);		
	}
	public Person delete(int id) {
		EntityManagerFactory remf = Persistence.createEntityManagerFactory("god");
		EntityManager rem = remf.createEntityManager();
		EntityTransaction ret = rem.getTransaction();
		Person r = rem.find(Person.class,id);
		if(r!=null) {
			ret.begin();
			rem.remove(r);
			ret.commit();
		}
		return r;
	}
	public Person update(Person p) {
		EntityManagerFactory remf = Persistence.createEntityManagerFactory("god");
		EntityManager rem = remf.createEntityManager();
		EntityTransaction ret = rem.getTransaction();
		if(p!=null) {
			ret.begin();
			rem.merge(p);
			ret.commit();
		}
		return p;
	}
}
