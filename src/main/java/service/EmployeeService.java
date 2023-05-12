package service;

import model.Employee;
import repository.EmployeeRepository;
import repository.MemoryEmployeeRepository;

import java.util.List;
import java.util.Optional;

public class EmployeeService {

    private final EmployeeRepository employeeRepository = new MemoryEmployeeRepository();

    //회원가입
    public Integer signUp(Employee employee){
        //중복아이디 금지
        validateDuplicateEmployee(employee);

        employeeRepository.save(employee);
        return employee.getEmployeeNumber();
    }

    private void validateDuplicateEmployee(Employee employee) {
        employeeRepository.findByNumber(employee.getEmployeeNumber())
                .ifPresent(e -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    //전체 회원 조회
    public List<Employee> findMembers() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> findOne(int staffNumber) {
        return employeeRepository.findByNumber(staffNumber);
    }

}
