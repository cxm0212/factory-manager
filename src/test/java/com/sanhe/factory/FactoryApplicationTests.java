package com.sanhe.factory;

import com.sanhe.factory.modules.employee.Employee;
import com.sanhe.factory.modules.employee.EmployeeDao;
import com.sanhe.factory.modules.employee.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FactoryApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FactoryApplicationTests {

    @Autowired
    private EmployeeService service;


    @Test
    public void contextLoads() {
        List<Employee> list = service.test();
        System.out.println(list);
    }



}
