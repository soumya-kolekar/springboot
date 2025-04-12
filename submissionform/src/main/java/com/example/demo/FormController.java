package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	
	@Autowired
	CustomersRep repo;
	@RequestMapping("/")
	public String details() {
		return "course1";
		
	}
	@RequestMapping("/details")
	public String details(Customers customers) {
		repo.save(customers);
		return "course1";
		
	}
	@RequestMapping("/getdetails")
	public String getdetails() {
		return "viewcustomer";
		
	}
@PostMapping("getdetails")
public ModelAndView getdetails(@RequestParam int cid) {
	ModelAndView mv = new ModelAndView("Retrive");
	Customers customers = repo.findById(cid).orElse(null);
	mv.addObject(customers);
	return mv;
}

//Rest api
/*json xml retun
 * you need to put in a lot of methods (request object,responseobject)
 * to rerieve the data
 * REST-respresntational state transfer
 * rest suggest to create an object of the data requested by the client
 * and sends the values of the object in resposne to the user
 * principles-
 * 1)stateless
 * 2)clientserver
 * 3)uniform interface
 * 4)caheable
 * 5)layered sysstem
 * 6)code on demand
 * 
 * 
 * */
//@RequestMapping("/customers")
//@ResponseBody
//public String getcustomers() {
//	
//	return repo.findAll().toString();
//	
//}
//@RequestMapping("/customers/{cid}")
//@ResponseBody
//public String getcustomers2(@PathVariable("cid") int cid) {
//	
//	return repo.findById(cid).toString();
//	
//}
@RequestMapping("/customers")
@ResponseBody
public List<Customers> getcustomers() {
	
	return repo.findAll();
	
}
@RequestMapping("/customers/{cid}")
@ResponseBody
public Optional<Customers> getcustomers2(@PathVariable("cid") int cid) {
	
	return repo.findById(cid);
	
}
@PostMapping("/customers")
public Customers getcustomers3(@RequestBody Customers customers) {
	repo.save(customers);
	return customers;
	
}
@DeleteMapping("/customers/{cid}")
public Customers getcustomers4(@PathVariable("cid") int cid) {
	Customers cust =repo.getOne(cid);
	repo.delete(cust);
	return cust;
	
}
@PutMapping(path="/customers",consumes= {"application/json"})
public Customers getcustomers5(@RequestBody Customers customers) {
	repo.save(customers);
	return customers;
	
}
//Spring data rest
//rest web services over data repos
//
///
/*
Exposes a discoverable REST API for your domain model

02
Allows to dynamically filter collection resources

03
Exposes dedicated search resources for query methods

04
Allows to define client specific representations

05
Supports JPA, MongoDB, Neo4j, Solr, Cassandra, Gemfire

06
Exposes metadata about the model discovered as JSON Schema

07
Allows to dynamically filter collection resources.*/
}