package com.yunusemre.springdemo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from spring container
		Coach myTennisCoach = context.getBean("breathCoach", Coach.class);
		// call a method
		System.out.println(myTennisCoach.getDailyWorkout());
		// close the context
		context.close();
	}

}
