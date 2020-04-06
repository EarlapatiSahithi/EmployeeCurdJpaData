package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.bean.Employee;
import com.capgemini.dao.Employeedao;

@Service
@Transactional
public class EmployeeService implements EmployeeServiceImpl {

	@Autowired
	private Employeedao dao;
	
	@Override
	public Employee getEmployeeDetails(int id) {
		return ((EmployeeService) dao).getEmployeeDetails(id);
	}

	@Override
	public Employee createEmployee(Employee employee) {
		return ((EmployeeService) dao).createEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return ((EmployeeService) dao).updateEmployee(employee);
	}

	@Override
	public Employee deleteEmployee(int id) {
		return ((EmployeeService) dao).deleteEmployee(id);
	}

	@Override
	public List<Object> fetchAllEmployees() {
		return ((EmployeeService) dao).fetchAllEmployees();
	}
}