package repository;

import domain.Employee;

import java.util.*;

public class MemoryEmployeeRepository implements EmployeeRepository{

    private static final Map<Long,Employee> employeeList = new HashMap<>();


    @Override
    public Employee save(Employee employee) {
        employee.setId(employee.getStaffNumber());
        employeeList.put(employee.getId(),employee);
        return employee;
    }

    @Override
    public Employee remove(Employee employee) {
        return null;
    }

    @Override
    public Optional<Employee> findByNumber(int staffNumber) {
        employeeList.values().stream()
                .filter(employee -> employee.getStaffNumber() == staffNumber)
                .findAny();
    }


    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(employeeList.values());
    }
}
