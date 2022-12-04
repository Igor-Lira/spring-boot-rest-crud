package com.igorlira.tech.springbootcruddemo.dao;

import java.util.List;

import com.igorlira.tech.springbootcruddemo.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
}