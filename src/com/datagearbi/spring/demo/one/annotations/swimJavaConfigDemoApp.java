package com.datagearbi.spring.demo.one.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class swimJavaConfigDemoApp {

	public static void main(String[] args) {

		// 1- Load the spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// 2- Retrieve bean from spring container
		/*
		 * It's used the default bean id -> the same name of the class with cammelCase
		 * -> tennisCoach
		 */
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		// 3- Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		//Call method to get the daily fortune
		System.out.println(theCoach.getDailyFortuene());
		
		//Call our new swim coach methods ... has the properties values injected
		System.out.println("Email: " + theCoach.getEmail());
		System.out.println("Team: " + theCoach.getTeam());

		// 4- Close the context
		context.close();

	}

}
