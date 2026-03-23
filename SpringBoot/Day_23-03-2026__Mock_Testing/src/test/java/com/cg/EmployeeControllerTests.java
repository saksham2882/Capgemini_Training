package com.cg;


import com.cg.controller.EmployeeController;
import com.cg.dto.EmployeeDTO;
import com.cg.entity.Employee;
import com.cg.service.IEmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import java.time.LocalDate;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private IEmployeeService service;

    private ObjectMapper mapper = new ObjectMapper().findAndRegisterModules();

    @Test
    void getEmployeeByIdApiTest() throws Exception {
        EmployeeDTO edto = new EmployeeDTO("Deepak", LocalDate.of(2003, 10, 14), 45000.0);
//        edto.setEmployeeId(1);
        when(service.getEmployee(1)).thenReturn(edto);

        mockMvc.perform(get("/employees/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.fullName").value("Deepak"))
                .andExpect(jsonPath("$.salary").value(45000.0));
    }


    @Test
    void getAllEmployeesApiTest() throws Exception {
        EmployeeDTO e1 = new EmployeeDTO("Deepak", LocalDate.of(2003, 10, 14), 45000.0);
        EmployeeDTO e2 = new EmployeeDTO("Deep", LocalDate.of(2003, 1, 4), 35000.0);
        EmployeeDTO e3 = new EmployeeDTO("Ashtam", LocalDate.of(2003, 9, 1), 65000.0);

        when(service.getAllEmployees()).thenReturn(List.of(e1, e2, e3));

        mockMvc.perform(get("/employees"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[1].fullName").value("Deep"))
                .andExpect(jsonPath("$[0].salary").value(45000.0));
    }


    @Test
    void getEmployeesBYNameApiTest() throws Exception {
        EmployeeDTO e1 = new EmployeeDTO("Deep", LocalDate.of(2003, 10, 14), 45000.0);
        EmployeeDTO e2 = new EmployeeDTO("Deep", LocalDate.of(2003, 1, 4), 35000.0);

        when(service.getEmployeeByName("Deep")).thenReturn(List.of(e1, e2));

        mockMvc.perform(get("/employees/name/Deep"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].fullName").value("Deep"));
    }


    @Test
    void createEmployeeApiTest() throws Exception {
        EmployeeDTO e1 = new EmployeeDTO("Deep", LocalDate.of(2003, 10, 14), 45000.0);
        when(service.createEmployee(any(EmployeeDTO.class))).thenReturn(e1);

        mockMvc.perform(post("/employees")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(e1)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.fullName").value("Deep"));
    }


    @Test
    void updateEmployeeApiTest() throws Exception {
        Employee e1 = new Employee("Rohit", LocalDate.of(2003, 10, 14), 45000.0);
        when(service.updateEmployee(any(Employee.class))).thenReturn(e1);

        mockMvc.perform(put("/employees")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(e1)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Rohit"))
                .andExpect(jsonPath("$.salary").value(45000.0));
    }


    @Test
    void deleteEmployeeApiTest() throws Exception {
        when(service.removeEmployee(101)).thenReturn("Employee Removed!!");

        mockMvc.perform(delete("/employees/101"))
                .andExpect(status().isOk())
                .andExpect(content().string("Employee Removed!!"));
    }
}
