package org.tnsif.medicinedashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.medicinedashboard.model.Medicine;
import org.tnsif.medicinedashboard.repository.MedicineRepository;

@Service
public class MedicineService {
	
	@Autowired
	private MedicineRepository repository;
	
	//create -C
	public Medicine registerMedicine(Medicine medicine)
	{
		return repository.save(null);
	}
	
	//Retrive-R
	public List<Medicine> getMedicine(Medicine medicine)
	{
		return (List<Medicine>) repository.findAll();
	}
	
	//Delete
	public void deleteMedicine(int id)
	{
		repository.deleteById(id);
	}
	
	//update
	public Medicine updateMedicine(Medicine medicine)
	{
		Integer id=medicine.getId();
		Medicine m1=repository.findById(id).get();
		m1.setMedicineName(medicine.getMedicineName());
		m1.setPrice(medicine.getPrice());
		return repository.save(m1);
				
	}
	
	

}
