


package com.bhavani.Employee_info.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data

@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id

    public int id;
    public String EmployeeId;
    public String name;
    public String address;
    public String phone;
    public String email;
    public String department;
    public String designation;
    public String salary;
}
