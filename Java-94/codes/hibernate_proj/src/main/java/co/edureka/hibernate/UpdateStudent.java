package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class UpdateStudent {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		session.beginTransaction();
		
		/*
		//-- updating student approach-1
		Student st = new Student(101, "Sunil Joseph", "sunil@edureka.co");
		session.update(st);
		*/
		
		//-- updating student approach-2
		Student st = session.get(Student.class, 114);
		
		if(st != null) {
			System.out.println(st);
			st.setStudentName("Praveen Kumar"); //dirty object
		}
		else
			System.out.println("no matching student found in data store");
		
		
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();	
	}

}
