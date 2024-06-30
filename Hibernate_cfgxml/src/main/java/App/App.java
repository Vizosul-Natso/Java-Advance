package App;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Entity.Users;

public class App {
	public static void main(String[] args) {
		
		SessionFactory f = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Users.class)
								.buildSessionFactory();
		
		Session s = f.getCurrentSession();
		
		try {
//			create object of entity class
			Users u1 = new Users();
			u1.setUserId(01);
			u1.setUserName("Natso");
			u1.setPassword("123");
			u1.setFirstName("Vizo");
			u1.setLastName("Natso");
				
//			start transaction
			s.beginTransaction();
			
//			perform operation
			s.save(u1);
			
//			commit transaction
			s.getTransaction().commit();
			
			System.out.println("done");
			
			
			
		}finally {
			s.close();
			f.close();
		}
	}

}
