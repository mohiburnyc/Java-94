package co.edureka.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class HQLTest {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		/*
		//String hql = "from co.edureka.hibernate.entity.Student";		
		//String hql = "from co.edureka.hibernate.entity.Student where studentName='Dimple'";
		//String hql = "from co.edureka.hibernate.entity.Student where studentName like 'S%'";
		String hql = "from co.edureka.hibernate.entity.Student where studentId IN(101,105,125,108)";
		*/
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between ?0 and ?1"; //positional parameters		
		Query<Student> q = session.createQuery(hql, Student.class);
		q.setParameter(0, 101);
		q.setParameter(1, 106);
		*/
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between :minsid and :maxsid"; //named parameters		
		Query<Student> q = session.createQuery(hql, Student.class);
		q.setParameter("minsid", 104);
		q.setParameter("maxsid", 125);
		
		List<Student> students = q.getResultList();
		
		for(Student st : students) {
			System.out.println(st);
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		}
		*/
		
		//-- DML operations with HQL
		String hql = "update co.edureka.hibernate.entity.Student set studentName='Arijith Datta' where studentId=102";
		Query q = session.createQuery(hql);
		
		session.beginTransaction();
		int rowsAffected = q.executeUpdate();
		System.out.println("employees updated = " + rowsAffected);
		
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();
	}

}
