package org.tnsif.autowiredexample;

public class Laptop {
	
	//DI in the form of objects
	Battery p;

	//DI using setters
	/*public void setP(Battery p) {
		this.p = p;
	}*/
	
	//Injecting the object of battery
	//DI Using constructor
	
	public void accept()
	{
		p.electricity();
	}

	public Laptop(Battery p) {
		super();
		System.out.println("Autowired using constructor");

		this.p = p;
	}

	
	
	
	

}
