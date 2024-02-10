package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.EmployeeBean;
import com.repository.EmployeeRepository;
import com.serives.EmployeeService;

@Repository
public class EmployeeDao implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<EmployeeBean> getAllEmployees() {
		// TODO Auto-generated method stub

		return employeeRepository.findAll();
	}

	@Override
	public int addEmployee(EmployeeBean employeeBean) {
		employeeRepository.save(employeeBean);
		return 1;
	}

}
