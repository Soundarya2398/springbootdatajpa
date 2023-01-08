 package com.te.datajpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.te.datajpa.dto.Employee;
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
	
	public Employee findByEmployee(int empid);

}
