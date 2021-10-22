package com.shivan;


//College class

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component
public class College {
	@Value("${college.Name}")
	private String collegeName;
	@Autowired
	private Principal principal;
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;
	
	public void test() {
		teacher.teach();
		principal.principalInfo();
		
		System.out.println("Testing college method");
		System.out.println("Testing Value annotation"+collegeName);
	}
	
}
