package org.dxc.mongodb.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.dxc.mongodb.entity.Employee;


public interface EmployeeService {
	public void saveEmployee (List<Employee> employee); 
    public Collection<Employee> getAllEmployee();
	Optional<Employee> findEmployeeById(int empId);
	void deleteEmployeeById(int empId);
	public void updateEmployee(Employee employee);
    
}
