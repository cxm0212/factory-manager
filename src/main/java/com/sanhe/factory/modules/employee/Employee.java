package com.sanhe.factory.modules.employee;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * create by
 * 三和智控: cxm on 2019/12/11
 */
@Data
public class Employee {

    private Integer id;
    @ApiModelProperty("员工编码")
    private String YGBM;
    /*
    姓名
     */
    private String YGXM;
    /*
    性别
     */
    private String YGXB;
    /*
    出生日期
     */
    private Date CSRQ;
    /*
    密码
     */
    private String DLMM;
    /*
    电话
     */
    private String LXDH;
    /*
    邮箱
     */
    private String LXYX;
    /*
    是否在职
     */
    private Integer SFZZ = 1;
    /*
    所属节点
     */
    private String SSJD;
    /*
    入职时间
     */
    private Date RZSJ;
    /*
    离职时间
     */
    private Date LZSJ;
    private String BZ;
    private Date BGSJ;
}
