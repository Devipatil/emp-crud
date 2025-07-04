package crud.employee_1.service;

import java.util.List;

import crud.employee_1.entities.Employee;

public interface EmployeeService {
	
	void addEmployee(Employee emp);
	
	void updateEmployee(Employee emp);
	
	Employee searchEmployee(int id);
	
	void deleteEmployee(int id);
	
	List<Employee> fetchAllEmployees();
}
