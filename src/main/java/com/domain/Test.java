package com.domain;/********************************************************************
 /**
 * @Project: spring_web
 * @Package com.zyht.domain
 * @author guohongjin
 * @date 2017/10/24 10:37
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author guohongjin
 * @ClassName Test
 * @Description 类描述
 * @date 2017/10/24
 */
public class Test {

    //输入时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    //输出时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date date;

    private int test;

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    private String password;

    private String name;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
