package com.scp.hibernate.InhiretanceDemo;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class HibernateUtilFile {
public static SessionFactory sessionFactory =null;
public static SessionFactory getSessionFactory() {
	if(null==sessionFactory)
	{
		sessionFactory =new Configuration().configure().buildSessionFactory();
	}
	return sessionFactory;
}


}
