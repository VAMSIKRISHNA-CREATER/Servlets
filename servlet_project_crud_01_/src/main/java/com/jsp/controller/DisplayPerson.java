package com.jsp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Person;
import com.jsp.services.PersonService;

@SuppressWarnings("serial")
@WebServlet("/displayperson")
public class DisplayPerson extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PersonService rps  = new PersonService();
		List<Person> list = rps.getAllService();
		if(list.size()>0) {
			req.setAttribute("list",list);
			RequestDispatcher rrd = req.getRequestDispatcher("displayperson.jsp");
			rrd.forward(req, resp);
		}else {
			RequestDispatcher rrd = req.getRequestDispatcher("home.jsp");
			rrd.include(req, resp);
		}
	}
}
