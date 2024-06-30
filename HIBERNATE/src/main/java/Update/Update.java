package Update;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entity.Car;

public class Update {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		//based on name
		et.begin();
		Car update= em.find(Car.class, 103);
		update.setName("Tata_Nexon");
		et.commit();
		System.out.println("updated!");
		
		//based on price
		et.begin();
		Car update1= em.find(Car.class, 102);
		update1.setPrice(1890999);
		et.commit();
		System.out.println("updated!");
		
//		Modifying the primary key of an existing entity is indeed not allowed in most database systems, including when using JPA (Java Persistence API).
//		et.begin();
//		Car update2= em.find(Car.class, 101);
//		update2.setId(100);
//		et.commit();
//		System.out.println("updated!");
		
	}
}
