package EmployeeAttendanceManagement.EmployeeAttendanceManagementspring.repository;

import domain.Employee;
import jdk.jfr.TransitionFrom;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import repository.MemoryEmployeeRepository;

import java.util.List;

class MemoryEmployeeRepositoryTest {

    MemoryEmployeeRepository repository = new MemoryEmployeeRepository();

    @Test
    public void save(){
        Employee employee = new Employee();
        employee.setName("주원");
        employee.setStaffNumber(20191469);

        repository.save(employee);

        Employee employee1 = repository.findByNumber(employee.getStaffNumber()).get();
        Assertions.assertThat(employee1).isEqualTo(employee1);

    }

    @Test
    public void remove(){
        Employee employee = new Employee();
        Employee e1 = new Employee(312,"테스토데스");
        employee.setName("테스트");
        employee.setStaffNumber(123);
        repository.save(employee);
        repository.save(e1);

        for(Employee e : repository.employeeList){
            System.out.println(e.getName());
        }


        for(Employee e : repository.employeeList){
            System.out.println(e.getName());
        }
    }


    @Test
    public void findById(){
        Employee employee1 = new Employee();
        employee1.setName("spring1");
        employee1.setStaffNumber(1);
        repository.save(employee1);


        Employee employee2 = new Employee();
        employee2.setName("spring2");
        employee2.setStaffNumber(1);
        repository.save(employee2);
    }

    @Test
    public void findAll(){
        Employee employee1 = new Employee();
        employee1.setName("spring1");
        employee1.setStaffNumber(1);
        repository.save(employee1);


        Employee employee2 = new Employee();
        employee2.setName("spring2");
        employee2.setStaffNumber(1);
        repository.save(employee2);

        List<Employee> result = repository.findAll();

        Assertions.assertThat(result.size()).isEqualTo(3);

    }
}
