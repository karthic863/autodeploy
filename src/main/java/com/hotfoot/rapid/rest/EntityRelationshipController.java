package com.hotfoot.rapid.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hotfoot.rapid.entity.College;
import com.hotfoot.rapid.entity.Department;
import com.hotfoot.rapid.entity.Employee;
import com.hotfoot.rapid.entity.Student;
import com.hotfoot.rapid.repository.CollegeRepository;
import com.hotfoot.rapid.repository.DepartmentRepository;
import com.hotfoot.rapid.repository.EmployeeRepository;
import com.hotfoot.rapid.repository.StudentRepository;

@RestController
public class EntityRelationshipController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	CollegeRepository collegeRepository;
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@RequestMapping(value="rest/get/entity",method = RequestMethod.GET)
	public ResponseEntity<?> getResponse(){
	     Employee e = employeeRepository.findOne(1L);
		return ResponseEntity.ok(e);
	}
	
	@RequestMapping(value="rest/get/student/entity",method = RequestMethod.GET)
	public ResponseEntity<?> getStudentResponse(){
	     Student e = studentRepository.findOne(1L);
		return ResponseEntity.ok(e);
	}
	
	@RequestMapping(value="rest/get/college/entity",method = RequestMethod.GET)
	public ResponseEntity<?> getCollegeResponse(){
		College e = collegeRepository.findOne(1L);
		return ResponseEntity.ok(e);
	}
	
	@RequestMapping(value="rest/get/department/entity",method = RequestMethod.GET)
	public ResponseEntity<?> getdepartmentResponse(){
		Department e = departmentRepository.findOne(1L);
		return ResponseEntity.ok(e);
	}
}
