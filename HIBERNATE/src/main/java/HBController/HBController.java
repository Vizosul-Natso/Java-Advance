package HBController;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.query.Query;

import Entity.Acessories;
import Entity.Car;
import Entity.Specification;

public class HBController {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		System.out.println("done");
		
//		Creating objects and inserting data into dB table 
//		Car c1 =  new Car(0, null, 0, 0, null)
		
		Car c2 = new Car();
		
//		c2.setId(102);
		c2.setName("Harrier");
		c2.setPrice(1800000);
		c2.setSno(02);
		
//		Specification s =new Specification();
//		
//		s.setEngine("v6");
//		s.setType("Fast");
//		
//		Acessories a = new Acessories();
//		a.setName("Turbo");
//		a.setPrice(3200);
		
		
		et.begin();
//		em.persist(c1);
		em.persist(c2);
		et.commit();
		
		System.out.println("Data inserted");
			
	}

}
