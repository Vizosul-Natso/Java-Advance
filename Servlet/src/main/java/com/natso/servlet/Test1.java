package com.natso.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test1")
public class Test1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		PrintWriter write = resp.getWriter();
		
		write.write("<html><body>");
		write.write("<h1>Welcome</h1>");
		write.write("<p>THIS IS THE CONTENT USING PRINT WRITER</p>");
		write.write("</html></body>");
	}

}
