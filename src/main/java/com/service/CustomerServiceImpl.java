package com.service;/********************************************************************
 /**
 * @Project: zyht_web
 * @Package com.service
 * @author wangzhenxin
 * @date 2017-09-15 21:13
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import com.dao.MybatisCustomerDao;
import com.domain.Customer;
import com.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wangzhenxin
 * @ClassName CustomerServiceImpl
 * @Description CustomerService实现
 * @date 2017-09-15
 */
@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {

//    //定义客户Dao对象
    @Autowired
    private MybatisCustomerDao mybatisCustomerDao;

    @Override
    public String saveCustomer(Customer customer) {
        mybatisCustomerDao.insertCustomer(customer);
        return"添加成功";
    }

    @Override
    public Customer selectCustomer(Customer customer) {
        return mybatisCustomerDao.getCustomer(customer);
    }

    @Override
    public PageBean<Customer> selectLimitCustomer(Integer currentPage, Integer pageSize) {
        PageBean<Customer> customerPageBean = new PageBean<Customer>();

        //设置当前页数
        customerPageBean.setCurrentPage(currentPage);
        //设置每页显示条数
        customerPageBean.setPageSize(pageSize);
        //获取总条数
        customerPageBean.setTotalCount(mybatisCustomerDao.getAllLineNum());
        //设置总页数
        customerPageBean.setTotalPage(customerPageBean.getAllTotalPage());
        //设置当前页游标值
        customerPageBean.setNowVernier(currentPage);
        //查询对应条数的客户信息
        customerPageBean.setData(mybatisCustomerDao.getLimitCustomer(customerPageBean.getVernier(),pageSize));

        return customerPageBean;
    }

    @Override
    public String updateCustomer(Customer customer) {
        mybatisCustomerDao.updateCustomer(customer);
        return "修改成功";
    }

    @Override
    public String deleteCustomer(Customer customer) {
        mybatisCustomerDao.deleteCustomer(customer);
        return "删除成功";
    }

    @Override
    public List<Customer> selectAllCustomer() {
//        return customerDao.selectAllCustomer();
        return mybatisCustomerDao.getAllCustomer();
    }
}
