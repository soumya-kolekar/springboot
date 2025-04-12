package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoursesController {
	//to configure the request
	@RequestMapping("/courses")
public String courses() {
	
	System.out.println("Welcome");
	return "Course.jsp";
}
}
