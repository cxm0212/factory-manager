package com.sanhe.factory;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by
 * 三和智控: cxm on 2019/12/10
 */
@Mapper
public interface Test {

    @Select("select * from t_employee")
    public String test();
}

