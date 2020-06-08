 package com.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	
	
	public Car() {
		System.out.println("car::constructor");
	}



 private IEngine eng;
	
	
 @Autowired
 public void setEng(IEngine eng) {
 System.out.println("car :: setEng() called");
 this.eng = eng;
}

	/*
	 * @Autowired public Car(IEngine eng) { System.out.println("Car :: Contructor");
	 * this.eng=eng; }
	 */


	public void drive() {
		//start engine
		int status = eng.start();
		if(status == 0)
		System.out.println("Journey Started....");
		System.out.println("Welcome to Springboot");
	}
}
