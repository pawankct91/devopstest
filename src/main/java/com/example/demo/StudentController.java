package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


	@GetMapping("/test")
	public String getInfo() {
		System.out.println("truefdfdasfdsa");
		return "sample data";
	}
	


}
