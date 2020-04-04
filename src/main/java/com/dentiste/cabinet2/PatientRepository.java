package com.dentiste.cabinet2;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Integer>{
	
//	public Patient FindByUser_PatientAndPassword_Patient (String user_Patient ,String password_Patient);

}
