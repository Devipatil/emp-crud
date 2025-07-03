package crud.employee_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import crud.employee_1.entities.Employee;

public interface EmployeeRepository extends JpaRepository <Employee, Integer> {

}
