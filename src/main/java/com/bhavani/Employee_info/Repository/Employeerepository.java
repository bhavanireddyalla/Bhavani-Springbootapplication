package com.bhavani.Employee_info.Repository;

import com.bhavani.Employee_info.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employeerepository extends JpaRepository<Employee,Integer> {
}
