package com.cg.service;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private IEmployeeRepo employeeRepo;

    public String createEmployee(Employee employee) {
        Employee e = employeeRepo.saveAndFlush(employee);
        return "Employee Created! Your EmpId is: " + e.getEmpId();
    }


    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }


    public Employee getEmployee(int empId) {
        Optional<Employee> op = employeeRepo.findById(empId);
        if (op.isPresent()) {
            return op.get();
        }
        return null;
    }


    public String updateEmployee(Employee employee) {
        employeeRepo.saveAndFlush(employee);
        return "Employee Updated! ";
    }


    public String removeEmployee(int empId) {
        if(getEmployee(empId) != null) {
            employeeRepo.delete(getEmployee(empId));
            return "Employee Removed! ";
        }
        return "Employee Not Found! ";
    }


    public List<Employee> getEmployeeByName(String name) {
        // return employeeRepo.findByName(name);
         return employeeRepo.findByNa(name);
    }


    public List<Employee> getEmployeeBySalaryLessThan(double salary) {
        return employeeRepo.findBySalaryLessThan(salary);
    }


//    public List<Employee> getByDOB(int  month, int year){
//        // return employeeRepo.findByDOB(month, year);
//    }

    public List<Employee> getByDOB(LocalDate start, LocalDate end) {
        return employeeRepo.findByDOB(start, end);
    }


    public List<Employee> getByDobBetween(LocalDate start, LocalDate end) {
        return employeeRepo.findByDobBetween(start, end);
    }

}


// NOTE: saveAndFlush return the Object, and it also used for insert and update