package com.cg;

import com.cg.dao.IEmployeeRepo;
import com.cg.dto.EmployeeDTO;
import com.cg.dto.EntityMapper;
import com.cg.entity.Employee;
import com.cg.exception.EmployeeNotFoundException;
import com.cg.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class SpringRestDemoApplicationTests {

    @Mock
    private IEmployeeRepo repo;                 // Mock Object of the Repo

    // @Autowired
    @InjectMocks                                // Inject the Mock Object
    private EmployeeService service;



    // -------------- 1. Test with the real Object not the mock ------------------
//    @Test
//    void testEmployeeById(){
//        assertNotNull(service.getEmployee(4));
//        // assertThrows(EmployeeNotFoundException.class, () -> service.getEmployee(895));
//        // assertThrows(EmployeeNotFoundException.class, () -> service.getEmployee(5));
//
//        assertEquals("Karan", service.getEmployee(5).getFullName());
//    }



    // --------------- 2. Test with the Mock Object ---------------------
    @Test
    void testEmployeeById(){
        EmployeeDTO edto = new EmployeeDTO("Raj", LocalDate.of(2003, 10, 2), 25000.0);
        edto.setEmployeeId(1001);
        Employee emp = EntityMapper.convertObjectToEntity(edto);
        Optional<Employee> op = Optional.of(emp);
        when(repo.findById(1001)).thenReturn(op);

        assertNotNull(service.getEmployee(1001));                    // Pass
        // assertNotNull(service.getEmployee(1002));                    // Fail
        assertEquals("Raj", service.getEmployee(1001).getFullName());

        verify(repo, times(2)).findById(1001);
    }


    @Test
    void testEmployeeByIdWithException(){
        when(repo.findById(1002)).thenThrow(EmployeeNotFoundException.class);
        assertThrows(EmployeeNotFoundException.class, () -> service.getEmployee(1002));
    }


    @Test
    void testGetAllEmployees(){
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Raj", LocalDate.of(2003, 10, 2), 25000.0));
        empList.add(new Employee("Mohit", LocalDate.of(2000, 3, 2), 30000.0));

        when(repo.findAll()).thenReturn(empList);
        List<EmployeeDTO> res =  service.getAllEmployees();
        assertEquals(2, res.size());
        verify(repo).findAll();
    }


    @Test
    void testRemoveEmployeeById(){
        Employee emp = new Employee("Raj", LocalDate.of(2003, 10, 2), 25000.0);
        emp.setEmpId(1001);
        Optional<Employee> op = Optional.of(emp);
        when(repo.findById(1001)).thenReturn(op);
        String res = service.removeEmployee(1001);
        assertEquals("Employee Removed!!", res);
        verify(repo, times(1)).deleteById(1001);
    }


    @Test
    void testCreateEmployee(){
        EmployeeDTO edto = new EmployeeDTO("Raj", LocalDate.of(2003, 10, 2), 25000.0);
        Employee emp = EntityMapper.convertObjectToEntity(edto);
        emp.setEmpId(1001);
        when(repo.saveAndFlush(any(Employee.class))).thenReturn(emp);

        EmployeeDTO d = service.createEmployee(edto);
        assertNotNull(d);
        assertEquals("Raj", d.getFullName());
        assertEquals(1001, d.getEmployeeId());
        verify(repo, times(1)).saveAndFlush(any(Employee.class));
    }


    @Test
    void testGetEmployeeByName(){
        List<Employee> empList = new ArrayList<>();
        Employee e1 = new Employee("Raj", LocalDate.of(2003, 10, 2), 25000.0);
        empList.add(e1);
        Employee e2 = new Employee("Raj", LocalDate.of(2000, 11, 12), 5000.0);
        empList.add(e2);

        when(repo.findByName("Raj")).thenReturn(empList);

        List<EmployeeDTO> res = service.getEmployeeByName("Raj");

        assertNotNull(res);
        assertEquals(2, res.size());
        assertEquals("Raj", res.get(0).getFullName());
        verify(repo, times(1)).findByName("Raj");
    }


    @Test
    void testUpdateEmployee(){
        Employee emp = new Employee("Raj", LocalDate.of(2003, 10, 2), 25000.0);
        emp.setEmpId(1001);
        Optional<Employee> op = Optional.of(emp);
        when(repo.findById(1001)).thenReturn(op);
        when(repo.saveAndFlush(any(Employee.class))).thenReturn(emp);

        Employee updated = service.updateEmployee(emp);
        assertNotNull(updated);
        assertEquals(emp, updated);
        verify(repo, times(1)).findById(1001);
        verify(repo, times(1)).saveAndFlush(emp);
    }
}
