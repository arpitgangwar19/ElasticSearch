package io.elasticsearch.controller;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.elasticsearch.model.PersonalDetails;
import io.elasticsearch.model.Product;
import io.elasticsearch.service.ElasticSearchService;
import io.elasticsearch.service.QueryOperations;


@RestController
public class ElasticSearchController {
	
	
	@Autowired
	ElasticSearchService elasticSearchService;
	
	@Autowired
	QueryOperations queryOperation;
	
	
	@GetMapping("/")  // Project checker
	public String check() {
		return "Working";
	}
	@GetMapping("/addTempDataBulk")   //Adding Hard Coded data in bulk using list of objects  
	public String addTempData() {
		List<PersonalDetails> li = new ArrayList<PersonalDetails>();
		li.add(new PersonalDetails("Arpit", "Gangwar", "Delhi", 24, "Bussa", "Mca", "********"));  // if id is not given it will autogenerate
		li.add(new PersonalDetails("Shiv", "Gangwar", "Delhi", 24, "Continental", "Mca", "********"));

		System.out.print("work1"); // testing 
		
		elasticSearchService.createProductBulk(li);
		return "Added Bulk Data";
	}
	@GetMapping("/addTempOneRow")
	public String addOneValue() {
		elasticSearchService.createProductIndex(new PersonalDetails("Shiv", "Gangwar", "Delhi", 24, "Continental", "Mca", "*********"));
		return "Added One Row";
	}

	
	@GetMapping("/findAll")
	public Iterable findbyname() {
			
		Iterable result=elasticSearchService.findByName();
		return result;
	}
	
	@GetMapping("/searchByName")
	public Iterable searchByName() {
			
		System.out.print("work3"); // testing
		Iterable result=queryOperation.findByProductName("Arpit");
		return result;
	}

	

}
