package com.spring.demo;

public class JavaCourse implements Course{
	
	@Override
	public String getCourseDetails() {
		return "This course is estimated about 4 months";
	}
}
