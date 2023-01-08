package com.te.datajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.datajpa.dto.Employee;
import com.te.datajpa.service.EmployeeService;

@RestController
public class EmployeeController {	
	@Autowired
	private EmployeeService service;
	
	@PostMapping(path="/add")
	public ResponseEntity<?>addData(@RequestBody Employee employee ){
		System.out.println("In controllerrrr......."+employee);
		try {
		service.addData(employee);
			return new ResponseEntity<String>("Data added Successfully",HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("something went wrong",HttpStatus.INTERNAL_SERVER_ERROR);
		}

	
	}
	
	@PutMapping(path="/update")
	public ResponseEntity<?>updateData(@RequestBody Employee employee){
		try {
			service.update(employee);
			return new ResponseEntity<String>("update successfully",HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String>("unable to update",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping(path="/seeAll")
	public List<Employee> seeAll() {
		return service.seeAll();
		
	}
	
	
	
	@DeleteMapping(path="/delete")
	public ResponseEntity<?>deleteData(int id){
		try {
			service.delete(id);
			return new ResponseEntity<String>("deleted suceessfully",HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<String>("unable to delete",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
