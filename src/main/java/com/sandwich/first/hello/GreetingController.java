package com.sandwich.first.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    @ResponseBody
    public String greeting() {
        return "Hello 陈上明sdfsdfdsf";
    }

    @RequestMapping("/greeting1")
    @ResponseBody
    public String greeting1() {
        return "greeting1 陈上明sdfsdfdsf";
    }

    @RequestMapping("/getGreeting")
    public  Greeting getGreeting(){
        Greeting greeting = new Greeting(1,"Hello word!!dsdff",new Date());

        return  greeting;
    }

//    @Bean
//    public StringHttpMessageConverter stringHttpMessageConverter(){
//        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("utf-8"));
//        return converter;
//    }
}