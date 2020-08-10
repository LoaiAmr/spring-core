package com.datagearbi.spring.demo.one.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve the bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// Call method on the bean
		System.out.println(theCoach.getDailyWorkout());

		//let's call our new method for fortune
		System.out.println(theCoach.getDailyFortune());
		
		// Close the context it's like as a clear
		context.close();

	}

}
