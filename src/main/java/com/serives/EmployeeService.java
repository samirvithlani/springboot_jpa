package com.serives;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bean.EmployeeBean;

@Service
public interface EmployeeService {

	public List<EmployeeBean> getAllEmployees();
	public int addEmployee(EmployeeBean employeeBean);

}
