package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @copyright (C), 2017-2020,jASON
 * @author: 19565
 * @date: 2020/8/12 14:18
 * @fileName: HelloWorld
 * @description: controller
 */
@RestController
@ResponseBody
public class HelloWorld {
    @RequestMapping("/helloworld")
    public String helloWorld(){
        return "helloWorld!";
    }
}
