package com.bange.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    Logger log = LoggerFactory.getLogger(HelloController.class);


    @RequestMapping("/hello")
    public String hello(){
       log.info("==>开始调用");
        return "hello";
    }


//    @RequestMapping({"/","/index.html"})
//    public String index(){
//        log.info("==>开始调用index");
//        return "index";
//    }

}
