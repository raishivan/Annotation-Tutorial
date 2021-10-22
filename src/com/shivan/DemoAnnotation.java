package com.shivan;

//DemoAnnotation class

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoAnnotation {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("college", College.class);
		System.out.println("College object created is "+ college);
		college.test();
		((AnnotationConfigApplicationContext) context).close();
	}

}
