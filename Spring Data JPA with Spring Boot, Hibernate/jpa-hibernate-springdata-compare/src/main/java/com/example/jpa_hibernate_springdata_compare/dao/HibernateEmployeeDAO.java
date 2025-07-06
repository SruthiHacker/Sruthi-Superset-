package com.example.jpa_hibernate_springdata_compare.dao;

import com.example.jpa_hibernate_springdata_compare.entity.Employee;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateEmployeeDAO {
    private static SessionFactory factory;

    static {
        factory = new Configuration().configure().buildSessionFactory();
    }

    public Integer addEmployee(Employee employee) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeID = null;

        try {
            tx = session.beginTransaction();
            employeeID = (Integer) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeID;
    }
}
