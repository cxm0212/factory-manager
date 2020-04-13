package com.sanhe.factory.modules.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * create by
 * 三和智控: cxm on 2019/12/11
 */
@Service
public class EmployeeService {

    private EmployeeDao dao;

    public EmployeeService(EmployeeDao dao) {
        this.dao = dao;
    }

    public List<Employee> test() {
        return dao.test();
    }
}
