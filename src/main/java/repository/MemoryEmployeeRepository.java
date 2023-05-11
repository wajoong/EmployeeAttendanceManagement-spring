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
        Employee employee = null;
        for(Employee e : employeeList){
            if(e.getStaffNumber() == staffNumber){
                employee = e;
            }
        }
        return Optional.ofNullable(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeList;
    }
}
