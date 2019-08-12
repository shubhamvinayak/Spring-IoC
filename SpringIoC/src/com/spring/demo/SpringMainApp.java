package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainApp {
	public static void main(String[] args) {
		//load Spring Configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from spring container
		Course course=context.getBean("course",Course.class);
		
		//call the methods on the bean
		System.out.println(course.getCourseDetails());
		
		//close the context
		context.close();
	}

}
