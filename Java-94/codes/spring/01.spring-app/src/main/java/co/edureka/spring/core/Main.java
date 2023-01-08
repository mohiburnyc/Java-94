package co.edureka.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//-- initialize spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		
		System.out.println("----------------------------------------------------------------------");
		int beansCount = context.getBeanDefinitionCount();
		System.out.println("no of beans configured = " + beansCount);
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("bean names ====> ");
		String[] beanNames = context.getBeanDefinitionNames();
		for(String beanName : beanNames) {
			System.out.println("\t\t----> "+ beanName);
		}
	}

}
