package org.dxc.mongodb.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.dxc.mongodb.entity.Employee;
import org.dxc.mongodb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")  
	public void saveEmployee(@RequestBody List<Employee> employee) {
		employeeService.saveEmployee(employee);
		 
	}
	
	@RequestMapping("/getall")
	public Collection<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	@GetMapping("/getbyid/{empId}")
	public Employee findEmployeeById(@PathVariable ("empId")int empId){
		return employeeService.findEmployeeById(empId).get();
		
	}
	@DeleteMapping("/deletebyid/{empId}")
	public void deleteEmployeeById(@PathVariable("empId") int empId) {
		employeeService.deleteEmployeeById(empId);
	}
	@PutMapping("/updatebyid/{empId}")
	public void updateEmployee(@PathVariable(value="empId") int empId, @RequestBody Employee employee) {
		employee.setEmpId(empId);
		employeeService.updateEmployee(employee);
		
	}
	
}
