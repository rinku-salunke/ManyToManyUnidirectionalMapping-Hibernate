package com.client;

import com.config.HibernateUtil;
import com.model.Course;
import com.model.Student;
import com.mysql.cj.Session;

public class Test {

public static void main(String[] args) {
	
	
	org.hibernate.Session session=HibernateUtil.getSessionFactory().openSession();
	
	Course   c=new Course();
	c.setCid(101);
	c.setCname("Java");
	
	
	Course c1=new Course();
	c1.setCid(102);
	c1.setCname("Python");
	
	
	
	
	
	Student s=new Student();
	s.setSid(1);
	s.setSname("Rinks");
	
	Student s1=new Student();
	s1.setSid(2);
	s1.setSname("jit");
	
	
	
	s.getC().add(c);
	
	s.getC().add(c1);
	  
	
	
	
	session.save(s);
	
	session.beginTransaction().commit();
	
	
	
}
	
	
	
	
	
	
}
