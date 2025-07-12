package com.cognizant.dao;

import com.cognizant.model.Department;
import java.util.List;

public class DepartmentDaoImpl implements DepartmentDao {
    private List<Department> departmentList;

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentList;
    }
}
