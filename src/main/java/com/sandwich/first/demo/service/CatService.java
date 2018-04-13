package com.sandwich.first.demo.service;

import com.sandwich.first.demo.bean.Cat;
import com.sandwich.first.demo.dao.CatDao;
import com.sandwich.first.demo.repository.Cat2Repository;
import com.sandwich.first.demo.repository.CatRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class CatService {

    @Resource
    private CatRepository catRepository;
    @Resource
    private Cat2Repository cat2Repository;
    @Resource
    private CatDao catDao;


    @Transactional
    public Cat save(Cat cat) {
        return catRepository.save(cat);
    }

    public Iterable<Cat> findAll() {
        return catRepository.findAll();
    }

    public Cat findByCatName(String catName){
        return cat2Repository.findByCatName(catName);
    }

    public Cat findMyCat(String catName) {
        return cat2Repository.findMyCat(catName);
    }

    public Cat selectByCatName(String catName) {
        return catDao.selectByCatName(catName);
    }
}
