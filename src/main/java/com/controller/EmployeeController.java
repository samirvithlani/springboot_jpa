package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bean.EmployeeBean;
import com.dao.EmployeeDao;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeDao employeeDao;

	@GetMapping("/employee")
	public ResponseEntity<?> getAllEmployee() {

		List<EmployeeBean> employees = employeeDao.getAllEmployees();
		if (employees.size() > 0) {

			return new ResponseEntity<List<EmployeeBean>>(employees, HttpStatus.OK);
		}
		return new ResponseEntity<Object>(null, HttpStatus.OK);

	}
	
	@PostMapping("/employee")
	public ResponseEntity<?> createEmployee(@RequestBody EmployeeBean employeeBean){
		
		
		int res = employeeDao.addEmployee(employeeBean);
		
			
			return new ResponseEntity<String>("employee Added", HttpStatus.OK);
		
		
		
	}
}
