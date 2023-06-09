package repository;

import model.Employee;

import java.util.*;

public class MemoryEmployeeRepository implements EmployeeRepository{

    private static final Map<Integer,Employee> employeeList = new HashMap<>();


    @Override
    public Employee save(Employee employee) {
        employeeList.put(employee.getEmployeeNumber(),employee);
        return employee;
    }

    @Override
    public Employee remove(Employee employee) {
        employeeList.remove(employee.getEmployeeNumber());
        return employee;
    }

    @Override
    public Optional<Employee> findByNumber(int staffNumber) {
        return Optional.ofNullable(employeeList.get(staffNumber));
    }


    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(employeeList.values());
    }
}
