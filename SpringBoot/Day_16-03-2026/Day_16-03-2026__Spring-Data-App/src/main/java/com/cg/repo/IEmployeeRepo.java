package com.cg.repo;

import com.cg.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {
}


// NOTE: it is automatically created and used by the spring