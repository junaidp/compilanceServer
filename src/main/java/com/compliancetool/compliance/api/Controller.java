package com.compliancetool.compliance.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Entry;

@RequestMapping("api/compliance")
@CrossOrigin(origins = "*", maxAge = 3600)
public class Controller {
	
	String ans ;
	
	@PostMapping
	public String calculate(@RequestBody Entry entry){
		ans = entry.getA() + entry.getB() +"";
		return "Answe : " +entry.getA() + entry.getB();
		
		
	}
	
	@GetMapping
	public String calculate()
	{
		return " answer :"+ ans;
	}

}
