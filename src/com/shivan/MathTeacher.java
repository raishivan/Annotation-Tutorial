package com.shivan;

import org.springframework.context.annotation.Primary;

//MathTeacher class

import org.springframework.stereotype.Component;

@Component

public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("This is the teach method in MathTeacher Class");

	}

}
