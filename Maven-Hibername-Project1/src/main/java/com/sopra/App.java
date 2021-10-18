package com.sopra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.sopra.entity.Student;

public class App {
	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Student stu = new Student();
		stu.setStid(103);
		stu.setFirstName("Rahul");
		stu.setLastName("Kumar");
		
		/*
		 * Deletion session.delete(stu);
		 */
                
			/*
			 * Insertion session.save(stu);
			 */
		
			/*
			 * Update session.update(stu);
			 */
		transaction.commit();

		System.out.println("successfully saved");
		factory.close();
		session.close();

	}
}
