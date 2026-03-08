package main.java.com.cg.service;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import main.java.com.cg.bean.Employee;
import main.java.com.cg.dao.EmployeeDao;
import main.java.com.cg.dao.IEmployeeDao;

public class EmployeeService implements IEmployeeService {
	IEmployeeDao dao=new EmployeeDao();
	
	@Override
	public String createEmployee(Employee emp) {
		if(emp.getName()==null || emp.getName().length()<4 || emp.getEmail()==null ) {
			return "Invalid Employee Data";
		}
		else {
			Random r=new Random();
			String empid=emp.getName().substring(0,3)+r.nextInt(1000);
			emp.setEmpid(empid);
			return dao.saveEmployee(emp);
		}
	}

	@Override
	public Employee findById(String eid) {
		if(eid==null) {
			return null;
		}
		return dao.findEmployee(eid);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return dao.getAll();
	}

	@Override
	public String updateEmployeeName(String eid, String name) {
		if(eid==null || name == null || name.length() < 4 ) {
			return "Invalid Employee Data";
		}
		else {
			return dao.updateEmployeeName(eid, name);
		}
	}

	@Override
	public String removeEmployee(String empid) {
        if(empid==null) {
			return "Invalid Employee Data";
		}
		else {
			return dao.deleteEmployee(empid);
		}
	}

}
