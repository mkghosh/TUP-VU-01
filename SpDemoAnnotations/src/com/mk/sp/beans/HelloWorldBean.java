package com.mk.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class HelloWorldBean  implements HelloWorld{
	
	private String msg;
	private NameTeller nameTeller;


	@Autowired
	public HelloWorldBean(@Qualifier("nameTeller1") NameTeller nt) {
		this.nameTeller = nt;
	}
	
	@Required
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		return msg;
	}
	
	public String tellName() {
		return nameTeller.tellYourName();
	}

}
