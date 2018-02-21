package com.scp.hibernate.InhiretanceDemo;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class mainClass {

	
		public static void main(String[] args) {

			Session session = HibernateUtilFile.getSessionFactory().openSession();
			Transaction trans = session.beginTransaction();
			JoinedTable p=new JoinedTable(1, "Megha");
			Childc1 c1=new Childc1("Megha1", "Pune");
			childc2 c2=new childc2("Megha2", "Mumbai");
			
			session.save(p);
			session.save(c1);
			session.save(c2);
			trans.commit();
			session.close();

		}
	}


