package com.cg.service;

import com.cg.entity.Employee;

import java.util.List;


public interface IEmployeeService {

    public List<Employee> getAllEmployees();
    public Employee createEmployee(Employee employee);
    public Employee getEmployee(int empId);
    public String removeEmployee(int empId);
    public Employee updateEmployee(Employee employee);
    public List<Employee> getEmployeeByName(String name);
}
