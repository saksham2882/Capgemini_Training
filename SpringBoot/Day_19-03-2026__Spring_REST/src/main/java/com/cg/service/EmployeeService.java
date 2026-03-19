package com.cg.service;

import com.cg.dao.IEmployeeRepo;
import com.cg.dto.EmployeeDTO;
import com.cg.dto.EntityMapper;
import com.cg.entity.Employee;
import com.cg.exception.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> emps = repo.findAll();
        List<EmployeeDTO> employees = new ArrayList<EmployeeDTO>();
        emps.forEach(e -> employees.add(EntityMapper.convertEntityToObject(e)));
        return employees;
    }


    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employee) {
        Employee e = repo.saveAndFlush(EntityMapper.convertObjectToEntity(employee));
        return EntityMapper.convertEntityToObject(e);
    }


    @Override
    public EmployeeDTO getEmployee(int empId) {
        Optional<Employee> op = repo.findById(empId);
        if(op.isPresent()){
            Employee e = op.get();
            return EntityMapper.convertEntityToObject(e);
        }
        else {
            throw new EmployeeNotFoundException("Employee not found");
        }
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
    public List<EmployeeDTO> getEmployeeByName(String name){
        List<Employee> emps = repo.findByName(name);
        List<EmployeeDTO> employees = new ArrayList<EmployeeDTO>();
        emps.forEach(e -> employees.add(EntityMapper.convertEntityToObject(e)));
        return employees;
    }
}
