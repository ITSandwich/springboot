package com.sandwich.first.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class GreetingController1 {

    @RequestMapping("/greeting2")
    @ResponseBody
    public String greeting1() {
        return "greeting2 陈上明sdfsdfdsf";
    }


}