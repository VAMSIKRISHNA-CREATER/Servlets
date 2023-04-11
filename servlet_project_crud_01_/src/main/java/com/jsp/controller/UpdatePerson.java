package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Person;
import com.jsp.services.PersonService;

@SuppressWarnings("serial")
@WebServlet("/updateperson")
public class UpdatePerson extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Person p = new Person();
		PersonService rps = new PersonService();
		p.setId(Integer.parseInt(req.getParameter("id")));
		p.setName(req.getParameter("name"));
		p.setAge(Integer.parseInt(req.getParameter("age")));
		p.setEmail(req.getParameter("email"));
		p.setPassword(req.getParameter("password"));
		Person p1 = rps.updateService(p);
		if(p1!=null) {
			RequestDispatcher rrd = req.getRequestDispatcher("home.jsp");
			rrd.forward(req, resp);
		}else {
			RequestDispatcher rrd = req.getRequestDispatcher("editperson.jsp");
			rrd.include(req, resp);
		}
		
		
	}
}
