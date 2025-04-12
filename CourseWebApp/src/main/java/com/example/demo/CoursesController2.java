package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CoursesController2 {
	//to configure the request
	@RequestMapping("/courses2")
	@ResponseBody
public String courses2() {
	
	return "Course2.jsp";
}
}
