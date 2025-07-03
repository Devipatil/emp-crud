package crud.employee_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import crud.employee_1.entities.Employee;
import crud.employee_1.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/add")
	public String add() {
		return "add_employee";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute Employee emp) {
		service.addEmployee(emp);
		return "index";
	}
}
