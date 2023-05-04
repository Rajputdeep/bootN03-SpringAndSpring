package org.tnsif.medicinedashboard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//below annotations is used to ensure that given class is the table in the data-b
@Entity
public class Medicine {
	//Private data members
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String medicineName;
	private Float price;
	
	//getters and setters method
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	
	
	
	

}
