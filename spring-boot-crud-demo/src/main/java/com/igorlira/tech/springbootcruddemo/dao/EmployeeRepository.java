package com.igorlira.tech.springbootcruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorlira.tech.springbootcruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
