package crud.employee_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.employee_1.entities.Employee;
import crud.employee_1.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
	
	@Autowired
	EmployeeRepository repo;
	
	public void addEmployee(Employee emp) {
		repo.save(emp);
		
	}
	
}
