package EmployeeAttendanceManagement.EmployeeAttendanceManagementspring.repository;

import model.Employee;
import org.junit.jupiter.api.Test;
import repository.MemoryEmployeeRepository;

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

    }


    @Test
    public void findById(){

    }

    @Test
    public void findAll(){

    }
}
