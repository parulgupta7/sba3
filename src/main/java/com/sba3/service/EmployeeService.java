package com.sba3.service;

import java.util.List;

import com.sba3.model.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee);
	List<Employee> getAllEmployees();
	
}
