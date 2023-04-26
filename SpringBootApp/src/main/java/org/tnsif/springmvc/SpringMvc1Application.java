package org.tnsif.springmvc;

import java.util.Scanner;

/*
 A convenience annotation that wraps commonly used annotations.
 Used in place of the following 3 different annotations.
 
 1)@configurations : Instructs that a Spring configuration class is being used instead of XML to define.
 the components
 2)@Enableautoconfiguration
 Instructs that the application should auto configure the other frameworks included as dependency with Spring.
 3)@ComponentScan : Scans project for Spring components annoted with @Service,@Reposetory.@Component.
 
 @Component
 It is used to denote tht a class is a component
 It allows spring to automatically detect our custom beans.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.tnsif.springwebmvc.HomeController;

@SpringBootApplication
public class SpringMvc1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringMvc1Application.class, args);
		Scanner s = new Scanner(System.in);
		/*int x=s.nextInt();
		System.out.println(x);*/
		Employee e = context.getBean(Employee.class);
		e.setEmpid(10123);
		e.setEmpname("Pratik Gosavi");
		e.print();
	}
}