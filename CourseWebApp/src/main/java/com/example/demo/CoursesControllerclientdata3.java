package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class CoursesControllerclientdata3{
	//to configure the request
	@RequestMapping("/courses3")
public String courses3(HttpServletRequest req) {
	HttpSession session=req.getSession();
	//System.out.println("@@");
	String cname=req.getParameter("cname");
	session.setAttribute("cname",cname);
	return "Course3.jsp";
}
}
