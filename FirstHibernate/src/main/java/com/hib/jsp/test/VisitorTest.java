package com.hib.jsp.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.jsp.beans.Visitor;

/**
 * This class is used to persist Visitor's basic information.
 * 
 * @author krishna yenduri
 * @version 1.0
 *
 */
public class VisitorTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction visitorTx = null;
		try {
			visitorTx = session.beginTransaction();
			Visitor visitor = new Visitor();
			visitor.setVisitorId(1002);
			visitor.setVisitorName("Y SAI SIVA KRISHNA");
			visitor.setVisitorMailId("tech.yssk@gmail.com");
			visitor.setVisitorMobileNo(9791064265L);
			visitor.setCountry("INDIA");
//			session.save(visitor);
			session.persist(visitor);
			visitorTx.commit();
		} catch (Exception e) {
			if (visitorTx != null) {
				visitorTx.rollback();
				System.out.println(e.getMessage());
			}
		} finally {
			session.close();
		}
	}
}
