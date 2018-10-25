package com.sba3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sba3.dao.EmployeeDao;
import com.sba3.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao empdao;
	
	@Override
	public Employee addEmployee(Employee employee) {
		return empdao.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return empdao.findAll();
	}

}
