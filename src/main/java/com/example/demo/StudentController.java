package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


	@GetMapping("/data")
	public String getInfo() {



		return "Pawan Sharma";
	}
	


}
