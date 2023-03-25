package com.olegzcv.rest.dao;

import com.olegzcv.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public Employee getEmployee(int id);

    public void saveEmployee(Employee employee);

    public boolean deleteEmployee(int id);

}
