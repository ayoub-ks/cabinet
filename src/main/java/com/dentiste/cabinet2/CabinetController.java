package com.dentiste.cabinet2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class CabinetController {
	@Autowired
	PatientDEO pat;
	
	@RequestMapping("/home")
	public String go(Model model) {
		Patient patient = new Patient();
		model.addAttribute("patient", patient);
		
		return "register"; 
		
	}
	@RequestMapping("/register")
	public String register(Model model) {
		Patient patient = new Patient();
		model.addAttribute("patient", patient);
		
		return "register2"; 
		
	}
	
	
	
	//@ResponseBody
	//@PostMapping("/loginPatient")
   // public String loginPatient(@RequestParam String user_Patient,@RequestParam String password_Patient) {
		
	//	if(pat.loginPatient(user_Patient, password_Patient)!=null) {
	//		return "welcom patient ";
	//	}else
	//	return "this account not found ";
		
//	}
	
	
	@ResponseBody
	@PostMapping("/RegisterPatient")
    public String goo(Patient patient ) {
		pat.savePatient(patient);
		return "saved";
		
	}

}
