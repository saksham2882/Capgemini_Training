package com.cg.controller;


import com.cg.dto.EmployeeDTO;
import com.cg.entity.Employee;
import com.cg.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public List<EmployeeDTO> getXYZ(){
        return service.getAllEmployees();
    }


    @GetMapping("/{empId}")
    public ResponseEntity<EmployeeDTO> getEmp(@PathVariable int empId){
        EmployeeDTO e = service.getEmployee(empId);
        if(e != null){
            return new ResponseEntity<EmployeeDTO>(e, HttpStatus.OK);
        } else {
            return new ResponseEntity("Employee not found", HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/name/{name}")
    public List<EmployeeDTO> getEmpByName(@PathVariable String name){
        return service.getEmployeeByName(name);
    }


    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO emp){
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
