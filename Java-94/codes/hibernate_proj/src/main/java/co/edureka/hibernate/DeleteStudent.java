package co.edureka.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class DeleteStudent {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		session.beginTransaction();
		
		/*
		//-- updating student approach-1
		Student st = new Student(101, "Sunil Joseph", "sunil@edureka.co");
		session.delete(st);
		*/
		
		//-- updating student approach-2
		Scanner sc = new Scanner(System.in);
		System.out.print("enter student id: ");
		int sid = sc.nextInt();
		
		Student st = session.get(Student.class, sid);
		
		if(st != null) {
			System.out.println(st);
			
			System.out.print("do you want to delete the studid[Y/N]: ");
			String req = sc.next();
			if(req.equalsIgnoreCase("Y"))
				session.delete(st);
		}
		else
			System.out.println("no matching student found in data store");
		
		
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();	

	}

}
