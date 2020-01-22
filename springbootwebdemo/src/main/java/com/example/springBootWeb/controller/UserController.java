package com.example.springBootWeb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static Logger log =  LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/user")
    public @ResponseBody String getUser(String userId){
        log.info("getUser-start");
        String result = "hello world，userId="+userId;
        log.info("getUser-end：userId="+userId);
        return result;
    }
}
