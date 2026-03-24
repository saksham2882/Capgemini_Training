package com.cg.service;

import com.cg.bean.Employee;
import com.cg.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo eRepo;

    public List<Employee> getAllEmp(){
        return eRepo.findAll();
    }
}
