package com.service;/********************************************************************
 /**
 * @Project: zyht_web
 * @Package com.service
 * @author wangzhenxin
 * @date 2017-09-15 17:31
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import com.domain.Customer;
import com.util.PageBean;

import java.util.List;

/**
 * @author wangzhenxin
 * @InterfaceName CustomerService
 * @Description 客户信息服务
 * @date 2017-09-15
 */
public interface CustomerService{
    /**
     * @Title: saveCustomer
     * @Description: 根据客户对象更新客户对象
     * @author wangzhenxin
     * @date 2017-09-15
     */
    public String saveCustomer(Customer customer);

    /**
     * @Title: selectCustomer
     * @Description: 查询对象信息
     * @author wangzhenxin
     * @date 2017-09-18
     */

    public Customer selectCustomer(Customer customer);


    /**
     * @Title: selectLimitCustomer
     * @Description: 根据当前页面信息和每页显示的条数查询客户信息
     * @author wangzhenxin
     * @date 2017-10-26
     * @param currentPage 当前页数
     * @param pageSize 每页显示的条数
     * @return PageBean<Customer>
     */
    public PageBean<Customer> selectLimitCustomer(Integer currentPage,Integer pageSize);
    /**
     * @Title:updateCustomer
     * @Description: 更新
     * @author wangzhenxin
     * @date 2017-09-18
     */
    public String updateCustomer(Customer customer);
    /**
     * @Title: deleteCustomer
     * @Description: 删除客户对象
     * @author wangzhenxin
     * @date 2017-09-18
     */
    public String deleteCustomer(Customer customer);

    /**
     * @Title: selectAllCustomer
     * @Description: 查询所有客户
     * @author wangzhenxin
     * @date 2017-09-26
     */
    public List<Customer> selectAllCustomer();

}
