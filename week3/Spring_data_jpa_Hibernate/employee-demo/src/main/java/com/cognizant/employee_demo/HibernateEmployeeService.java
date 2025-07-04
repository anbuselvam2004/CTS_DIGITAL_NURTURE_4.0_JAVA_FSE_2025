package com.cognizant.employee_demo;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class HibernateEmployeeService {
	 private static SessionFactory factory;

	    static {
	        factory = new Configuration()
	            .configure("hibernate.cfg.xml")  // You can create this XML or use programmatic config
	            .addAnnotatedClass(Employee.class)
	            .buildSessionFactory();
	    }

	    public Integer addEmployee(Employee employee) {
	        Session session = factory.openSession();
	        Transaction tx = null;
	        Integer id = null;
	        try {
	            tx = session.beginTransaction();
	            id = (Integer) session.save(employee);
	            tx.commit();
	        } catch (HibernateException e) {
	            if (tx != null) tx.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        return id;
	    }
	}
	