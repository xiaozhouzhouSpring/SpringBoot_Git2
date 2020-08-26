package com.ygnet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HelloController
 *
 * @author shenhuz
 * @date 2020/8/26
 **/
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return  "Hello Worid";
    }

    @RequestMapping("/jack")
    public String jack(){
        return  "Hello jack";
    }
}
