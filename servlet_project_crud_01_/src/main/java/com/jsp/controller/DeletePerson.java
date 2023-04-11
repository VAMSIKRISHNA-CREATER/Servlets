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
@WebServlet("/deleteperson")
public class DeletePerson extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PersonService rps = new PersonService();
		int id=Integer.parseInt(req.getParameter("id"));
		Person p1 = rps.deleteService(id);
		if(p1!=null) {
			RequestDispatcher rrd = req.getRequestDispatcher("home.jsp");
			rrd.forward(req, resp);
		}else {
			RequestDispatcher rrd = req.getRequestDispatcher("deleteperson.jsp");
			rrd.forward(req, resp);
		}
	}
}
