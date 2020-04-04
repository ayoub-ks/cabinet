package com.dentiste.cabinet2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientDEO {
	@Autowired
 	PatientRepository patientRepository ;
	
	public Patient savePatient(Patient dnt) {	
		return patientRepository.save(dnt);
	}

	
	public List<Patient> findallPatients(){
		return patientRepository.findAll() ;
	}
	
	public Patient findPatientById(Integer id ) {
		return patientRepository.getOne(id);
	}
	
	public void deletePatient(Patient dnt ) {
		
		patientRepository.delete(dnt);
	}
	
	//public Patient loginPatient (String user_Patient,String password_Patient) {
		
		//return patientRepository.FindByUser_PatientAndPassword_Patient(user_Patient, password_Patient);
		
//	}
}
