package org.tnsif.springwebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
 * A controller contain the business logic of an application.
 * @controller annotation is used to talk mark the class as a controller.
 */
@Controller
public class HomeController {
	@RequestMapping("/admin")
	public String home() {
		System.out.println("Code to demonstrate on to simple" +"Web Application");
		return "home.jsp";
	}

}