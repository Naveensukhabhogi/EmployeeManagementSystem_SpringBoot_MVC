package com.ty.EmployeeManagementSystem_SpringBoot_MVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.EmployeeManagementSystem_SpringBoot_MVC.entity.Employee;
import com.ty.EmployeeManagementSystem_SpringBoot_MVC.repository.EmployeeRepo;

@Service
public class EmployeeServiceImp implements Employeeservice {

    @Autowired
    private EmployeeRepo repo;

    @Override
    public List<Employee> getAllEmployee() {
        return repo.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void saveEmployee(Employee emp) {
        repo.save(emp);
    }

    @Override
    public void updateEmployee(long id, Employee emp) {
        Employee employee = repo.findById(id).orElse(null);

        if (employee != null) {
            employee.setName(emp.getName());
            employee.setDepartment(emp.getDepartment());
            employee.setEmail(emp.getEmail());
            employee.setMob_num(emp.getMob_num());

            repo.save(employee);
        }
    }

    @Override
    public void deleteEmployee(long id) {
        repo.deleteById(id);
    }
}