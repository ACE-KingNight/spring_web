package com.controller;/********************************************************************
 /**
 * @Project: spring_web
 * @Package com.controller
 * @author wangzhenxin
 * @date 2017-11-01 9:42
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;

/**
 * @author wangzhenxin
 * @ClassName FileUploadController
 * @Description 类描述
 * @date 2017-11-01
 */
@Controller
@RequestMapping("/file")
public class FileUploadController {
    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) throws IOException {
        String path="E:/"+new Date().getTime()+ file.getOriginalFilename();
        java.io.File newFile= new java.io.File(path);
        file.transferTo(newFile);
        return "index";
    }

}
