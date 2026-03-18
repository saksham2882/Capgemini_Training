package com.cg.repo;

import com.cg.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {


    // ==================== If want to find the data with (non-primary key) ===================

    // Way 1:
    // public List<Employee> findByName(String name);        // must be the property_name present in the Employee
    // implementation is done by the springboot


    // Way 2: if we want to use another method name than the property_name
    @Query("select e from Employee e where e.name=:n")
    public List<Employee> findByNa(@Param("n") String name);


    public List<Employee> findBySalaryLessThan(double salary);


    public List<Employee> findByNameAndSalary(String name, double salary);


    // @Query("select e from Employee e where MONTH(e.dob)=:month AND YEAR(e.dob)=:year")
    @Query("SELECT e FROM Employee e WHERE e.dob >=:start AND e.dob <=:end")
    public List<Employee> findByDOB(LocalDate start, LocalDate end);


    public List<Employee> findByDobBetween(LocalDate start, LocalDate end);
}


// NOTE: it is automatically created and used by the spring