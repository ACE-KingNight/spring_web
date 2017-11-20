package com.util;/********************************************************************
 /**
 * @Project: spring_web
 * @Package com.zyht.util
 * @author guohongjin
 * @date 2017/10/23 17:41
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */


import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;


public class CustomObjectMapper extends ObjectMapper {

    /**
     * Instantiates a new custom object mapper.
     */
    public CustomObjectMapper(){
        this.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    }
}