package com.sandwich.first.demo.controller;

import com.sandwich.first.demo.bean.Cat;
import com.sandwich.first.demo.repository.CatRepository;
import com.sandwich.first.demo.service.CatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CatController {

    @Resource
    private CatService catService;

    @RequestMapping("/create")
    public Cat createCat(){
        Cat cat= new Cat();
        cat.setCatAge(2);
        cat.setCatName("小猫");
        cat = catService.save(cat);
        return cat;
    }

    @RequestMapping("/getCats")
    public Iterable getCats(){
        Iterable<Cat> cats = catService.findAll();
        return cats;
    }

    @RequestMapping("/findByCatName")
    public Cat findByCatName(String catName){
        Cat cat = catService.findByCatName(catName);
        return cat;
    }

    @RequestMapping("/findMyCat")
    public Cat findMyCat(String catName){
        Cat cat = catService.findMyCat(catName);
        return cat;
    }

    @RequestMapping("/selectByCatName")
    public Cat selectByCatName(String catName){
        Cat cat = catService.selectByCatName(catName);
        return cat;
    }
}
