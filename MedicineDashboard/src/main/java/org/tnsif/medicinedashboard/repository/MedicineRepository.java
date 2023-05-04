package org.tnsif.medicinedashboard.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.tnsif.medicinedashboard.model.Medicine;

@Repository
public interface MedicineRepository extends CrudRepository<Medicine,Integer>{

}
