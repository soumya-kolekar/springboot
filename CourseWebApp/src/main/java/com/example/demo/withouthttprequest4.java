package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
//model and view
@Controller
public class withouthttprequest4{
	//to configure the request
	@RequestMapping("/courses4")
//public String courses3(String cname, HttpSession session) {
	//or courses3(@RequestParam("cname")String cousrename, HttpSession session) 
	public ModelAndView courses3(@RequestParam("cname")String cousrename,String cname) {
		ModelAndView mv= new ModelAndView();
		mv.addObject("cname",cousrename);
	mv.setViewName("Course4.jsp");
			 return mv;
}
}
