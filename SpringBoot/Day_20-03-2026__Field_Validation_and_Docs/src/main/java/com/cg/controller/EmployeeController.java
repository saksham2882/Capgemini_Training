package com.cg.controller;


import com.cg.dto.EmployeeDTO;
import com.cg.entity.Employee;
import com.cg.service.IEmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("employees")
@Tag(name = "Employee API", description = "This provide the CRUD operation with Employee Entity")
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
    @Operation(summary = "This API will provide all employee details from MySQL DB")
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


//    @GetMapping("/name/{name}")
//    public List<EmployeeDTO> getEmpByName(@PathVariable String name){
//        return service.getEmployeeByName(name);
//    }


    @GetMapping("/name")
    public List<EmployeeDTO> getEmpByName(@RequestParam("n") String name){
        return service.getEmployeeByName(name);
    }


    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody @Valid EmployeeDTO emp){
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
