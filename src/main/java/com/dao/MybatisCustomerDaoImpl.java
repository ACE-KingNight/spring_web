package com.dao;/********************************************************************
 /**
 * @Project: zyht_web
 * @Package com.dao.MybatisPackageInformationDao
 * @author wangzhenxin
 * @date 2017-10-24 16:22
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import com.base.MyBatisBaseDaoImpl;
import com.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangzhenxin
 * @ClassName MybatisCustomerDaoImpl
 * @Description 类描述
 * @date 2017-10-24
 */
@Repository("mybatisCustomerDao")
public class MybatisCustomerDaoImpl extends MyBatisBaseDaoImpl<Customer> implements MybatisCustomerDao {
    @Override
    public List<Customer> getAllCustomer() {
        return sqlSessionTemplate.selectList(getMybaitsNameSpace()+"getAllCustomer");
    }

    @Override
    public List<Customer> getLimitCustomer(Integer currentPage, Integer pageSize) {
        Map<String,Integer> pageMap = new HashMap<String,Integer>();
        pageMap.put("currentPage",currentPage);
        pageMap.put("pageSize",pageSize);
        return sqlSessionTemplate.selectList(getMybaitsNameSpace()+"getLimitCustomer", pageMap);
    }

    @Override
    public Integer getAllLineNum() {
        return sqlSessionTemplate.selectOne(getMybaitsNameSpace()+"getAllLineNum");
    }

    @Override
    public Customer getCustomer(Customer customer) {
        return sqlSessionTemplate.selectOne(getMybaitsNameSpace()+"getCustomer",customer);
    }

    @Override
    public void insertCustomer(Customer customer) {
        sqlSessionTemplate.insert(getMybaitsNameSpace()+"insertCustomer",customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        sqlSessionTemplate.update(getMybaitsNameSpace() + "updateCustomer", customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        sqlSessionTemplate.delete(getMybaitsNameSpace() + "deleteCustomer", customer);
    }
}
