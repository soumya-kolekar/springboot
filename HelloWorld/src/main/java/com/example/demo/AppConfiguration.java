package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AppConfiguration {
	//insert the url
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
//MVC-model view controller
	//java framework which is used to build web applications
//dependency injection:ability of am object to supply dependencies of another object
	//^------------------------------------------------v
	//injector class->injects ->client class->uses->service clsss 
	//class A (needs to create instance of class B)->before A uses methods of class B
//depends on principle Inversion of Control	 (order food from outside)
//types of Dependency injection
	//1-Constructor->DEpendencies are provided through a class constructor
	//2-Setter->Injector method injects the dependency to the setter method exposed by the client
	//3-Interface->Injector uses Interface to provide the dependency to the client class
	
	//spring provides a dignified solution to use MVC in springboot framework by the help of dispatcher servlet
	//dispatcher servlet is a class that receives the incoming requests and maps it
//front controller -> model-> controller->model->view
	//|												|
	//v												v
	//				web browser
	//
}
