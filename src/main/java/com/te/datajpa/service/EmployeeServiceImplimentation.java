package com.te.datajpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.datajpa.dao.EmployeeDao;
import com.te.datajpa.dto.Employee;
@Service
public class EmployeeServiceImplimentation implements EmployeeService {
@Autowired
	private EmployeeDao dao;
	@Override
	public Employee addData(Employee employee) {
		return dao.save(employee);
		
	}
	@Override
	public Employee update(Employee employee) {
		
		return dao.save(employee);
	}
	@Override
	public List<Employee> seeAll() {
		List<Employee> list=(List<Employee>)dao.findAll();
		return list;
		
	}
	@Override
	public void delete(int empid) {
		Employee employee=dao.findByEmployee(empid);
		 dao.delete(employee);
		
	}
	
	
		
		
	
}
