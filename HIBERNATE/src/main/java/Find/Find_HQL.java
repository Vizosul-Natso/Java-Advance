package Find;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Entity.Car;

public class Find_HQL {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		find operation using HQL
//		1.Based on Name
		Query q = em.createQuery("SELECT c FROM Car c where c.Name=?1");
		q.setParameter(1, "Thar");
		
		Car FoundCar = (Car) q.getSingleResult();
		System.out.println(FoundCar);
		System.out.println("1 found");
		
		System.out.println("-----------------------------------------" +"\n");
		
//		2.Based on Price
		Query q1=em.createQuery("SELECT c from Car c where c.price=?1");
		
		q1.setParameter(1, 1800000.00);
		
		Car foundcar1=(Car)q1.getSingleResult();
		System.out.println(foundcar1);
		
		System.out.println("CAR ID: " +foundcar1.getId());
		System.out.println("CAR NAME: "+foundcar1.getName());
		System.out.println("CAR PRICE: "+foundcar1.getPrice());
		
		System.out.println("-----------------------------------------"+"\n");
		
//		3.Based on ID
		
		System.out.println(em.find(Car.class, 101));
		
	}

}
