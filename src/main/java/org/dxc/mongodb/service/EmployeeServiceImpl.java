package org.dxc.mongodb.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;


import org.dxc.mongodb.entity.Employee;
import org.dxc.mongodb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public void saveEmployee(List<Employee> employee) {
		employeeRepository.saveAll(employee);
	}
	@Override
	public Collection<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
	@Override
	public Optional<Employee> findEmployeeById(int empId){
		return employeeRepository.findById(empId);
	}
	@Override
	public void deleteEmployeeById(int empId) {
		employeeRepository.deleteById(empId);
	}
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

}
