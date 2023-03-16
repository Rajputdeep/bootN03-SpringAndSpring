package org.tnsif.literels;

public class SwiftEngine implements IEngine {
	
	//DI in the form of literals
	private String company;
	private double cost;
	
	public double cost() {		
		return cost;
		
		
	}
	public String display() {		
		return "Japan";
				
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Origin: " +cost +" "+fuel;
	}
		
	
}