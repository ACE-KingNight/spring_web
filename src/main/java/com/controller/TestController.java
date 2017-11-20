package com.controller;/********************************************************************
 /**
 * @Project: spring_web
 * @Package com.zyht.controller
 * @author guohongjin
 * @date 2017/10/24 11:34
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import com.domain.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author guohongjin
 * @ClassName TestController
 * @Description 类描述
 * @date 2017/10/24
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/testOne")
    public String test(Test test,String date,HttpServletRequest httpServletRequest){

        System.out.println(test.getName());
        System.out.println(test.getDate());
        System.out.println(date);
        System.out.println(test.getTest());
        return "index";
    }

    @RequestMapping("/testTwo")
    public ModelAndView testTwo(){

        return new ModelAndView("index");
    }

    @RequestMapping("/testThree")
    @ResponseBody
    public String testThree(){
        return "testThree";
    }

    @RequestMapping("/testForth")
    @ResponseBody
    public Test testForth(){
        Test test=new Test();
        test.setName("test");
        String string = "sad";
//        test.setDate(new Date());
        return test;
    }


    public void testFive(@RequestHeader("Accept-Encoding") String encoding,
                                  @RequestHeader("Keep-Alive") long keepAlive) {

    }

    @RequestMapping("/pets/{petId}")
    public void findPet( @PathVariable String petId) {
        // implementation omitted
        System.out.println(petId);
    }

    /**
     * @Title:
     * @Description:  把cookie中“JSESSIONID”的值绑定到cookie参数中
     * @author guohongjin
     * @date 2017-10-24
     */
    @RequestMapping("/testFive")
    public void testFive(@CookieValue("JSESSIONID") String cookie)  {

        //...

    }

    /** 
     * @Title:
     * @Description: Content-Type: 为 application/x-www-form-urlencoded
     * @author guohongjin
     * @date 2017-10-24
     */
    @RequestMapping(value = "/testFrom",method = RequestMethod.POST)
    public void testFrom(Test test) {

        System.out.println(test);
    }

    /**
     * @Title:
     * @Description: 该注解常用来处理Content-Type: 不是application/x-www-form-urlencoded编码的内容，例如application/json, application/xml等；
     * @author guohongjin
     * @date 2017-10-24
     */
    @RequestMapping(value = "/something", method = RequestMethod.POST)
    public void handle(@RequestBody String body)  {
        System.out.println(body);
    }


}
