package com.datagearbi.spring.demo.one.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricket", CricketCoach.class);

		// Call method on the bean
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		System.out.println(theCoach.getEmail());

		System.out.println(theCoach.getTeam());

		// Close the context
		context.close();

	}

}
