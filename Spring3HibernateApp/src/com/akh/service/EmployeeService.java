package com.akh.service;

import java.util.List;

import com.akh.model.Employee;

/**
 * @author akhilesh
 *
 */
public interface EmployeeService {
	
	public void addEmployee(Employee employee);

	public List<Employee> listEmployeess();
	
	public Employee getEmployee(int empid);
	
	public void deleteEmployee(Employee employee);
}
