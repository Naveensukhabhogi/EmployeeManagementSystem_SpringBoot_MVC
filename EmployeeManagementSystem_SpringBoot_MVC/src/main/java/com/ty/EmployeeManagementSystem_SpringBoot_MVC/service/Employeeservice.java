package com.ty.EmployeeManagementSystem_SpringBoot_MVC.service;

import java.util.List;

import com.ty.EmployeeManagementSystem_SpringBoot_MVC.entity.Employee;

public interface Employeeservice
{
    public List<Employee> getAllEmployee();
    public Employee getEmployeeById(long id);
    
    public void saveEmployee(Employee emp);
    
    public void updateEmployee(long id, Employee emp);
    
    public void deleteEmployee(long id);
}
