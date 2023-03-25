package com.olegzcv.rest.dao;

import com.olegzcv.rest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO{

    @Autowired
    private SessionFactory factory;

    @Override
    public List<Employee> getAllEmployees() {
        Session session = factory.getCurrentSession();
        Query<Employee> query = session.createQuery("from Employee", Employee.class);
        List<Employee> result = query.getResultList();
        return result;
    }

    @Override
    public Employee getEmployee(int id) {
        Session session = factory.getCurrentSession();
        Employee result = session.get(Employee.class, id);
        return result;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session = factory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    @Override
    public boolean deleteEmployee(int id) {
        Session session = factory.getCurrentSession();
        boolean result = session.get(Employee.class, id) != null;
        if(result) {
            Query<Employee> query = session.createQuery("delete from Employee where id =: employeeId");
            query.setParameter("employeeId", id);
            query.executeUpdate();
        }
        return result;
    }
}
