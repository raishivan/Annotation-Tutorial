package com.shivan;

//ScienceTeacher class

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("This is the teach method in ScienceTeacher Class");

	}

}
