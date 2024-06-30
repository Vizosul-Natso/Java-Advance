package Servlet.UserLogin;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/disp2")
public class disp2 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
	EntityManager em= emf.createEntityManager();
	EntityTransaction et= em.getTransaction();
	
	String username=(String) req.getAttribute("name");
	String password=(String) req.getAttribute("password");
	
	User user1= new User();
	user1.setName(username);
	user1.setPassword(password);
	
	
	et.begin();
	em.persist(user1);
	et.commit();
	
	System.out.println("done");
	
	}
}
