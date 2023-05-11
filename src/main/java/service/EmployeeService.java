package service;

import model.Employee;
import repository.EmployeeRepository;
import repository.MemoryEmployeeRepository;

import java.util.Optional;

public class EmployeeService {

    private final EmployeeRepository employeeRepository = new MemoryEmployeeRepository();

    //회원가입
    public Integer signUp(Employee employee){
        //중복아이디 금지
        Optional<Employee> result = employeeRepository.findByNumber(employee.getStaffNumber());
        result.ifPresent(e -> {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });

        employeeRepository.save(employee);
        return employee.getStaffNumber();
    }


}
