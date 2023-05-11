package repository;

import domain.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {
    Employee save(Employee employee);
    Employee remove(Employee employee);
    Optional<Employee> findByNumber(int staffNumber);
    List<Employee> findAll();
}
