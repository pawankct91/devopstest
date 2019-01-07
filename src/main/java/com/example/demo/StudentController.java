package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class StudentController {


	@GetMapping("/test")
	public Map<Integer,String> getInfo() {
		System.out.println("sample data");

	    Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Admin");
		map.put(2,"Employe");
		return map;
	}
	


}
