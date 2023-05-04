package org.tnsif.medicinedashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.medicinedashboard.model.Medicine;
import org.tnsif.medicinedashboard.service.MedicineService;

@RestController
public class MedicineController {
	
	@Autowired
	private MedicineService service;
	
	//Creation
	@PostMapping("/registerMedicine")
	public Medicine registerMedicine(@RequestBody Medicine medicine)
	{
		return service.registerMedicine(medicine);
	}
	
	//update
	@PutMapping("/updateStudent")
	public Medicine updateMedicine(Medicine medicine)
	{
		return service.registerMedicine(medicine);
	}
	
	
	//Retrive-R
	@GetMapping("/getMedicine")
		public List<Medicine> getMedicine(Medicine medicine)
		{
			return service.getMedicine(medicine);
		}
		
		//delete
	@DeleteMapping("/deleteMapping")
		public void deleteMedicine(@RequestParam Integer id)
		{
			service.deleteMedicine(id);
		}
		
		

}
