package EmployeeAttendanceManagement.EmployeeAttendanceManagementspring.repository;

import model.Employee;
import org.junit.jupiter.api.Test;
import repository.MemoryEmployeeRepository;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MemoryEmployeeRepositoryTest {

    MemoryEmployeeRepository repository = new MemoryEmployeeRepository();

    @Test
    public void save(){
        Employee employee = new Employee();
        employee.setStaffNumber(2019);
        employee.setName("주원");

        repository.save(employee);

        Employee employee1 = repository.findByNumber(employee.getStaffNumber()).get();
        assertThat(employee1).isEqualTo(employee);
    }

    @Test
    public void remove(){
        Employee employee = new Employee();
        employee.setStaffNumber(2019);
        employee.setName("주원");

        repository.save(employee);

        Employee employee1 = new Employee();
        employee1.setStaffNumber(2020);
        employee1.setName("현우");

        repository.save(employee1);

        repository.remove(employee1);

        List<Employee> result = repository.findAll();

        assertThat(result.size()).isEqualTo(1);
    }


    @Test
    public void findById(){

    }

    @Test
    public void findAll(){

    }
}
