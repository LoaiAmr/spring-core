package com.datagearbi.spring.demo.one.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		// Load Spring configure file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContextAnnotations.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		// Check if they are the same value in memory
		boolean result = (theCoach == alphaCoach);

		// Print out the result
		System.out.println("\nPointing the same object " + result);

		System.out.println("\nMemory Location For theCoach" + theCoach);

		System.out.println("\nMemory Location For alphaCoach" + alphaCoach);

		// Close the context
		context.close();

	}

}
