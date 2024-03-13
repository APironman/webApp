package com.prowings.dao;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = new Configuration().configure(new File("D:\\Eclipse\\webApp\\src\\main\\java\\com\\prowings\\entity\\hibernate.cfg.xml")).buildSessionFactory();
			return sessionFactory;
		} else
			return sessionFactory;
	}
}
