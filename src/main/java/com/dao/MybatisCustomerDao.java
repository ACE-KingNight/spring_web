package com.dao;/********************************************************************
 /**
 * @Project: zyht_web
 * @Package com.dao.MybatisPackageInformationDao
 * @author wangzhenxin
 * @date 2017-10-24 16:16
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import com.domain.Customer;

import java.util.List;

/**
 * @author wangzhenxin
 * @InterfaceName MybatisCustomerDao
 * @Description 接口描述
 * @date 2017-10-24
 */
public interface MybatisCustomerDao {
    /**
     * @Title: getAllCustomer
     * @Description: 查询所有客户信息
     * @author wangzhenxin
     * @date 2017-10-24
     */

    public List<Customer> getAllCustomer();

    /**
     * @Title: getLimitCustomer
     * @Description: 根据当前页面数和每页显示条数分页查询客户
     * @author wangzhenxin
     * @date 2017-10-26
     * @param currentPage 当前页面数
     * @param pageSize 每页显示条数
     * @return  List<Customer>
     */

    public List<Customer> getLimitCustomer(Integer currentPage,Integer pageSize);

    /**
     * @Title: getAllLineNum
     * @Description: 获取客户信息总条数
     * @author wangzhenxin
     * @date 2017-10-26
     */

    public Integer getAllLineNum();

    /**
     * @Title: getCustomer
     * @Description: 查询单个客户信息
     * @author wangzhenxin
     * @date 2017-10-24
     * @param customer 客户信息对象
     */

    public Customer getCustomer(Customer customer);

    /**
     * @Title: insertCustomer
     * @Description: 插入客户信息
     * @author wangzhenxin
     * @date 2017-10-24
     * @param customer 客户信息对象
     */
    public void insertCustomer(Customer customer);

    /**
     * @Title: updateCustomer
     * @Description: 根据客户对象信息修改客户对象
     * @author wangzhenxin
     * @date 2017-10-24
     * @param customer 客户信息对象
     */

    public void updateCustomer(Customer customer);

    /**
     * @Title: deleteCustomer
     * @Description: 根据客户对象信息删除客户对象
     * @author wangzhenxin
     * @date 2017-10-24
     * @param customer 客户信息对象
     */

    public void deleteCustomer(Customer customer);
}
