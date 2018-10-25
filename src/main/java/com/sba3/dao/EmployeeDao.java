package com.sba3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sba3.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long>{
	
	

}
