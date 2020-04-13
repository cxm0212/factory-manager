package com.sanhe.factory.modules.employee;

import com.sanhe.factory.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * create by
 * 三和智控: cxm on 2019/12/11
 */
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;

//    @Autowired
//    private RedisUtil redisUtil;

    @RequestMapping("/finduer")
    public List<Employee> listEmployee(){
        List<Employee> test = service.test();
        Employee employee = test.get(0);
//        redisUtil.hset("test_"+employee.getId(),"YG",employee.getYGXM());
//        String yg = (String) redisUtil.hget("test_" + employee.getId(), "YG");
//        System.out.println(yg+"---------------------------testredis");

        System.out.println("list : " + test);
        return test;
    }
}
