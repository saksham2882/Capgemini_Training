package com.cg.controller;


import com.cg.entity.Employee;
import com.cg.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("employees")
public class EmployeeController {

//    @GetMapping("employees")
//    public Employee getXYZ(){
//        return new Employee(101, "Ram", LocalDate.of(2003, 01, 4), 5000);
//    }


    // @Autowired
    private IEmployeeService service;

    // Constructor Injection
    public EmployeeController(IEmployeeService service) {
        this.service = service;
    }


    @GetMapping
    public List<Employee> getXYZ(){
        return service.getAllEmployees();
    }


    @GetMapping("/{empId}")
    public Employee getEmp(@PathVariable int empId){
        return service.getEmployee(empId);
    }


    @GetMapping("/name/{name}")
    public List<Employee> getEmpByName(@PathVariable String name){
        return service.getEmployeeByName(name);
    }


    @PostMapping
    public Employee createNewEmployee(@RequestBody Employee emp){
        return service.createEmployee(emp);
    }


    @DeleteMapping("/{empId}")
    public String deleteEmp(@PathVariable int empId){
        return service.removeEmployee(empId);
    }


    @PutMapping
    public Employee updateEmp(@RequestBody Employee employee) {
        return service.updateEmployee(employee);
    }
}
