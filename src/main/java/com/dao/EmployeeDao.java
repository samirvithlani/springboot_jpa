package com.dao;

import java.util.List;
import java.util.Optional;

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

		return employeeRepository.findAll(); // select * fr
	}

	@Override
	public int addEmployee(EmployeeBean employeeBean) {
		employeeRepository.save(employeeBean);
		return 1;
	}

	public int updateEmployee(EmployeeBean employeeBean) {

		Optional<EmployeeBean> empBean = employeeRepository.findById(employeeBean.getId());
		if (empBean.isPresent()) {

			EmployeeBean employeeBean2 = empBean.get(); //db old 
			
			employeeBean2.setAge(employeeBean.getAge());
			employeeBean2.setName(employeeBean.getName());
			employeeRepository.save(employeeBean2);

		}

		return 1;

	}

}
