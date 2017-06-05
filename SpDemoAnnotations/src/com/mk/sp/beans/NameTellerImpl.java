package com.mk.sp.beans;

public class NameTellerImpl  implements NameTeller{

	String name;
	
	public NameTellerImpl(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String tellYourName() {
		return "Your Name is " + name;
	}

}
