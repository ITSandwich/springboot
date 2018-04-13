package com.sandwich.first.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/templates")
public class TemplatesController {

    @RequestMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("name","Sandwich");
        return mav;
    }

    @RequestMapping("/helloFtl")
    public String helloFtl(Map<String,Object> map){
        map.put("name","Sandwich1");
        return "helloFtl";
    }
}
