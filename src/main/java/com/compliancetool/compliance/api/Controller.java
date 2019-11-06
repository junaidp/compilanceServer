package com.compliancetool.compliance.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Entry;

@RequestMapping("api/compliance")
@CrossOrigin(origins = "*", maxAge = 3600)
public class Controller {
	
	@GetMapping
	public String calculate(@RequestBody Entry entry){
		return "Answe : " +entry.getA() + entry.getB();
		
		
	}

}
