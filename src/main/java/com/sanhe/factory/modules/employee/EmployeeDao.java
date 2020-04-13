package com.sanhe.factory.modules.employee;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * create by
 * 三和智控: cxm on 2019/12/10
 */
@Mapper
@Component
public interface EmployeeDao {

    @Select("select * from t_employee")
    public List<Employee> test();
}

