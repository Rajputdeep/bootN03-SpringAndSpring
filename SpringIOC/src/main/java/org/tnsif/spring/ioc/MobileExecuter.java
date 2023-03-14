package org.tnsif.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileExecuter {

	public static void main(String[] args) {
		
		//hard coding
		
		/*
		Airtel a=new Airtel();
		a.call();
		a.message();
		
		Jio j=new Jio();
		j.call();
		j.message();
		*/
		
		@SuppressWarnings("resource")
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		
//		Jio a=(Jio) c.getBean("Jio");
//		a.call();
//		a.message();
		
//		Airtel a=(Airtel) c.getBean("Airtel");
//		a.call();
//		a.message();
		
		Sim s=c.getBean("Sim",Sim.class);
		s.call();
		s.message();

	}

}