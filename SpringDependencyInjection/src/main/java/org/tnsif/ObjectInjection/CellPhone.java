package org.tnsif.ObjectInjection;
//program to demonstrate DI in the form of objects
public class CellPhone {
	
	//DI In form of object
	Charger charger;
	
	
	
	
	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	
	//Injecting the object of power class
	public void accept() {
		
		charger.power();
	}

	
	
	
	
	
	
	
	
	
	
	//setters
//	public void setC(Charger c) {
//		this.c = c;
//	}
//	public void setS(Sim s) {
//		this.s = s;
//	}
	
//	//TO String
//	@Override
//	public String toString() {
//		return "CellPhone [c=" + c + ", s=" + s + "]";
//	}
	
	
	
	

}
