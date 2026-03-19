package com.cg.service;

import com.cg.dto.EmployeeDTO;
import com.cg.entity.Employee;

import java.util.List;


public interface IEmployeeService {

    public List<EmployeeDTO> getAllEmployees();
    public EmployeeDTO createEmployee(EmployeeDTO employee);
    public EmployeeDTO getEmployee(int empId);
    public String removeEmployee(int empId);
    public Employee updateEmployee(Employee employee);
    public List<EmployeeDTO> getEmployeeByName(String name);
}
