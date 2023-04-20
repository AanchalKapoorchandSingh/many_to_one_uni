package com.jsp.hospital.branches;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("aanchal");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Hospital hospital=new Hospital();
	hospital.setGst_number("fgh5dfgh95");
	hospital.setName("Appollo");
	
	Branch b1=new Branch();
	b1.setName("Appollo-1");
	b1.setLocation("vashi");
	
	
	Branch b2=new Branch();
	b2.setName("Appollo-2");
	b2.setLocation("thane");
	
	Branch b3=new Branch();
	b3.setName("Appollo-3");
	b3.setLocation("panvel");
	
	b1.setHospital(hospital);
	b2.setHospital(hospital);
	b3.setHospital(hospital);
	
	et.begin();
	em.persist(hospital);
	em.persist(b3);
	em.persist(b2);
	em.persist(b1);
	et.commit();
	
}
}
