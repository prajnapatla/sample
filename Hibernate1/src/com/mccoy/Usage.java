package com.mccoy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Usage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp  e1=new Emp();
		Configuration config= new Configuration().configure();
		System.out.println("configuration is created");
		SessionFactory sf=config.buildSessionFactory();
		System.out.println("configuration is created");
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		e1.setEno(1);
		e1.setEname("Madhu");
		e1.setSal(20000);
		e1.setDesig("s/w Eng");
		ses.save(e1);
		tx.commit();
		ses.close();
		sf.close();

	}

}
