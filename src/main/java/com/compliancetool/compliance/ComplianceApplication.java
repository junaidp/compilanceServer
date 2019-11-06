package com.compliancetool.compliance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*")
public class ComplianceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComplianceApplication.class, args);
	}

}
