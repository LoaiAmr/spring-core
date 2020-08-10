package com.datagearbi.spring.demo.one.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// 1- Load the spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// 2- Retrieve bean from spring container
		/*
		 * It's used the default bean id -> the same name of the class with cammelCase
		 * -> tennisCoach
		 */
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		// 3- Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortuene());

		// 4- Close the context
		context.close();

	}

}
