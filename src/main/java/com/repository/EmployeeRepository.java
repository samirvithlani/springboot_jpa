package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.EmployeeBean;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeBean, Integer>{

}
