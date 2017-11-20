package com.controller;/********************************************************************
 /**
 * @Project: spring_web
 * @Package com.controller
 * @author wangzhenxin
 * @date 2017-10-26 15:46
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import com.domain.Customer;
import com.service.CustomerService;
import com.util.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzhenxin
 * @ClassName CustomerController
 * @Description 类描述
 * @date 2017-10-26
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Resource
    private CustomerService customerService;

    @RequestMapping("/findAllCustomer")
    @ResponseBody
    public PageBean<Customer> findAllCustomer(Integer currentPage){
        //如果当前页面为空则显示第1页
        if(currentPage == null || currentPage.equals("")){
            currentPage = 1;
        }
        PageBean<Customer> customerPageBean = customerService.selectLimitCustomer(currentPage,10);
        return customerPageBean;
    }
}
