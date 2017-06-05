/*package com.mk.sp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.mk.sp.beans.HelloWorld;
import com.mk.sp.beans.HelloWorldBean;
import com.mk.sp.beans.NameTeller;
import com.mk.sp.beans.NameTellerImpl;

@Configuration
public class SpringConfig {
	
	@Bean(name="nameTeller")
	public NameTeller getNameTeller() {
		return new NameTellerImpl("Name1");
	}
	
	@Bean(name="nameTeller2")
	public NameTeller getNameTeller2() {
		return new NameTellerImpl("Name2");
	}
	@Autowired
	@Qualifier("nameTeller2")
	private NameTeller nameTeller;
	
	@Bean(name="hello")
	@Scope("prototype")
	public HelloWorld getHelloWorld() {
		return new HelloWorldBean(nameTeller);
	}

}
*/