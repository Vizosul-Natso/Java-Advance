package com.natso.Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dispatcher1")
public class Dispatcher1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(name.equalsIgnoreCase("Natso") && password.equals("123")) 
		{
			RequestDispatcher dispatcher = req.getRequestDispatcher("dispatcher2");
			req.setAttribute("name", name);
			req.setAttribute("password", password);
			dispatcher.forward(req, resp);
		}
		else 
		{
			RequestDispatcher dispatcherX = req.getRequestDispatcher("login.html");
			dispatcherX.include(req, resp);
		}
	}

}
