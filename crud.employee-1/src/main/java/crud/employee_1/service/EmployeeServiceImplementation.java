package crud.employee_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import crud.employee_1.entities.Employee;
import crud.employee_1.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
	
	@Autowired
	EmployeeRepository repo;
	
	public void addEmployee(Employee emp) {
		repo.save(emp);	
	}

	public void updateEmployee(Employee emp) {
		repo.save(emp);		
	}


	public Employee searchEmployee(@RequestParam int id) {
			return repo.findById(id).get();
	}

	public void deleteEmployee(@RequestParam int id) {
		repo.deleteById(id);		
	}

	public List<Employee> fetchAllEmployees() {
		return repo.findAll();
	}
	
}
