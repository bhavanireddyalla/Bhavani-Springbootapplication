package com.bhavani.Employee_info.Service;

import com.bhavani.Employee_info.Model.Employee;
import com.bhavani.Employee_info.Repository.Employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class Employeeservice {
    @Autowired
    private Employeerepository repo;

    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }
}
