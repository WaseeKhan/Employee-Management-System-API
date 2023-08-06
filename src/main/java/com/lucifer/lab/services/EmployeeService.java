package com.lucifer.lab.services;

import com.lucifer.lab.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
