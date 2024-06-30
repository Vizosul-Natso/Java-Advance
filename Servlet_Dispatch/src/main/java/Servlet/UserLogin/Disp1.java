package Servlet.UserLogin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/disp1")
public class Disp1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name= req.getParameter("name");
		String password= req.getParameter("pw");
		
		if(name.equalsIgnoreCase("meera") && password.equals("meera@123")) {
			RequestDispatcher d= req.getRequestDispatcher("disp2");
			req.setAttribute("name", name);
			req.setAttribute("password", password);
			d.forward(req, resp);
		}else {
			RequestDispatcher d1= req.getRequestDispatcher("login.html");
			d1.include(req, resp);
		}
	}
	
}
