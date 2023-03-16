package org.tnsif.ObjectInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.tnsif.literels.SwiftEngine;

public class DIUsingObjects {

	public static void main(String[] args) {
		
		BeanFactory f=new ClassPathXmlApplicationContext("Web.xml");
		CellPhone e1=f.getBean("c2",CellPhone.class);
		e1.accept();
		//System.out.println(e);
		//System.out.println(e.cost());
		//System.out.println(e.display());

	}

}