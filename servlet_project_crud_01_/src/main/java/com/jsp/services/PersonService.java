package com.jsp.services;

import java.util.List;

import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;

public class PersonService {
	static PersonDao dao = new PersonDao();
	public Person savePersonService(Person p) {
		return dao.savePerson(p);
	}
	public Person getByIdService(int id) {
		return dao.getById(id);
	}
	public List<Person> getAllService(){
		return dao.getAll();
	}
	public Person updateService(Person p) {
		return dao.update(p);
	}
	public Person deleteService(int id) {
		return dao.delete(id);
	}
}
