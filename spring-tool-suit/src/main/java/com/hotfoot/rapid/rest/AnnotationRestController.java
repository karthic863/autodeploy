package com.hotfoot.rapid.rest;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hotfoot.rapid.pojo.Address;
import com.hotfoot.rapid.pojo.Employee;
import com.hotfoot.rapid.pojo.EmployeeJsonMap;
import com.hotfoot.rapid.pojo.EmployeeMap;

@RestController
public class AnnotationRestController {

	
	@RequestMapping(value="/rest/read/jsonignore",method = RequestMethod.GET)
	public ResponseEntity<?> getResponse(){
		Employee e = new Employee();
		e.setName("KB");
		e.setTitle("Mr");
		e.setEmployeeId("12345");
		return ResponseEntity.ok(e);
		
	}
	@RequestMapping(value="/rest/write/jsonignore",method = RequestMethod.GET)
	public ResponseEntity<?> getJsonResponse(@RequestParam String name, @RequestParam String title){
		Employee e = new Employee();
		e.setName(name);
		e.setTitle(title);
		return ResponseEntity.ok(e);
		
	}
	
	@RequestMapping(value="/rest/read/jsonignoreproperties",method = RequestMethod.GET)
	public ResponseEntity<?> getDataResponse(){
		Employee e = new Employee();
		e.setName("KB");
		e.setTitle("Mr");
	    e.setFirstName("Karthic");
	    e.setLastName("Kumar");
		return ResponseEntity.ok(e);
		
	}
	@RequestMapping(value="/rest/write/jsonignoreproperties",method = RequestMethod.GET)
	public ResponseEntity<?> getDataJsonResponse(@RequestParam String name, @RequestParam String title,@RequestParam String firstName,@RequestParam String lastName){
		Employee e = new Employee();
		e.setName(name);
		e.setTitle(title);
		e.setFirstName(firstName);
		e.setLastName(lastName);
		return ResponseEntity.ok(e);
		
	}
	
	@RequestMapping(value="/rest/read/jsonignoretype",method = RequestMethod.GET)
	public ResponseEntity<?> getJsonDataResponse(){
		Employee e = new Employee();
		Address a = new Address();
		e.setName("KB");
		e.setTitle("Mr");
	    e.setFirstName("Karthic");
	    e.setLastName("Kumar");
	    a.setLine1("Chennai");
	   e.setAddress(a);
	    return ResponseEntity.ok(e);
		
	}
	@RequestMapping(value="/rest/write/jsonignoretype",method = RequestMethod.GET)
	public ResponseEntity<?> getObjectDataJsonResponse(@RequestParam String name, @RequestParam String line1){
		Employee e = new Employee();
		Address a = new Address();
		e.setName(name);
		a.setLine1(line1);
		   e.setAddress(a);
		return ResponseEntity.ok(e);
		
	}
	
	@RequestMapping(value="/rest/read/without/jsonsetter",method = RequestMethod.GET)
	public ResponseEntity<?> getWithoutJsonSetterResponse(){
		 ObjectMapper mapper = new ObjectMapper(); 
		 String jsonString = "{\"RollNo\" : \"1\",\"Name\" : \"Mark\"}"; 
   	  EmployeeMap e =new EmployeeMap(); 
		 try { 
	    	 e = mapper.readerFor(EmployeeMap.class).readValue(jsonString); 
	         System.out.println(e.getProperties().get("Name")); 
	         System.out.println(e.getProperties().get("RollNo")); 
	      }
	      catch (IOException ex) {
	         ex.printStackTrace(); 
	      } 
		System.out.print(e.get("name"));
		return ResponseEntity.ok(e);
		
	}
	@RequestMapping(value="/rest/read/jsonsetter",method = RequestMethod.GET)
	public ResponseEntity<?> getJsonSetterResponse(){
		 ObjectMapper mapper = new ObjectMapper(); 
		 String jsonString = "{\"RollNo\" : \"1\",\"Name\" : \"Mark\"}"; 
   	  EmployeeJsonMap e =new EmployeeJsonMap(); 
		 try { 
	    	 e = mapper.readerFor(EmployeeJsonMap.class).readValue(jsonString); 
	         System.out.println(e.getProperties().get("Name")); 
	         System.out.println(e.getProperties().get("RollNo")); 
	      }
	      catch (IOException ex) {
	         ex.printStackTrace(); 
	      } 
		System.out.print(e.get("name"));
		return ResponseEntity.ok(e.getProperties());
		
	}
	
	@RequestMapping(value="/rest/read/jsoninclude",method = RequestMethod.POST)
	public ResponseEntity<?> getJsonIncludeResponse(@RequestBody Employee e){
		return ResponseEntity.ok(e);
		
	}
}
