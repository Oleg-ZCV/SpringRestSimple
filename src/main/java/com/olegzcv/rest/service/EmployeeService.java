package com.olegzcv.rest.service;

import com.olegzcv.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public Employee getEmployee(int id);

    public void saveEmployee(Employee employee);

    public boolean deleteEmployee(int id);

    public void updateEmployee(Employee employee);
}
