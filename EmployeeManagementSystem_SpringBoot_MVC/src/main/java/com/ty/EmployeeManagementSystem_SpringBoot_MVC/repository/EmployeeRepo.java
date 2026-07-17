package com.ty.EmployeeManagementSystem_SpringBoot_MVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.EmployeeManagementSystem_SpringBoot_MVC.entity.Employee;

@Repository
public interface EmployeeRepo  extends JpaRepository<Employee, Long>
{
    
}
