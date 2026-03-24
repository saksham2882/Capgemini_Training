package com.cg.controller;

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/emps")
    public ResponseEntity<List<Employee>> getAllEmployees(HttpSession session) {
        if(session.getAttribute("name") != null) {
            return new ResponseEntity<List<Employee>>(service.getAllEmp(), HttpStatus.OK);
        } else {
            return new ResponseEntity("Please Login!", HttpStatus.UNAUTHORIZED);
        }
    }
}
