package org.tnsif.springmvc;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empid;
	//getters and setters
	private String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public void print() {
		System.out.println("Employee are belongs to IT Departments ");
		System.out.println("Emp Id"+empid+" "+"Employee Name :"+empname);
	}
	
	

}