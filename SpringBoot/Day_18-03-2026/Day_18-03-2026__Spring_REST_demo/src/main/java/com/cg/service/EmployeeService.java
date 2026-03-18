package com.cg.service;

import com.cg.dao.IEmployeeRepo;
import com.cg.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeService implements IEmployeeService{

    // @Autowired
    private IEmployeeRepo repo;

    // Constructor Injection
    public EmployeeService(IEmployeeRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }


    @Override
    public Employee createEmployee(Employee employee) {
        return repo.saveAndFlush(employee);
    }


    @Override
    public Employee getEmployee(int empId) {
        Optional<Employee> op = repo.findById(empId);
        if(op.isPresent()){
            return op.get();
        }
        return null;
    }


    @Override
    public String removeEmployee(int empId) {
        if(getEmployee(empId) == null){
            return "Employee not found";
        }
        repo.deleteById(empId);
        return "Employee Removed!!";
    }


    @Override
    public Employee updateEmployee(Employee employee) {
        if(getEmployee(employee.getEmpId()) != null){
            return repo.saveAndFlush(employee);
        }
        return null;
    }


    @Override
    public List<Employee> getEmployeeByName(String name){
        return repo.findByName(name);
    }
}
