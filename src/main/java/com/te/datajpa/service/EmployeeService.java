package com.te.datajpa.service;

import java.util.List;

import com.te.datajpa.dto.Employee;

public interface EmployeeService {
	public Employee addData(Employee employee);
	
	public Employee update(Employee employee);
	
	public List<Employee> seeAll();
	
	public void delete(int empid);

}
