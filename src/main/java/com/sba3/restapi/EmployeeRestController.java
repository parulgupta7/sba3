package com.sba3.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sba3.model.Employee;
import com.sba3.service.EmployeeService;

@RestController
@RequestMapping(value="/")
public class EmployeeRestController {

	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/list")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		
		ResponseEntity<List<Employee>> resp = null;
		
		List<Employee> employees = empService.getAllEmployees();
		
		if(employees!=null)
			resp = new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
		else
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		
		return resp;
	}
	
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		
		ResponseEntity<Employee> resp = null;
		
		resp = new ResponseEntity<>(empService.addEmployee(employee), HttpStatus.OK);
		
		return resp;
		
	}
	
}
