package com.sandwich.first.demo.dao;

import com.sandwich.first.demo.bean.Cat;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class CatDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public Cat selectByCatName(String catName){
        String sql = "select * from cat where cat_name=?";
        RowMapper<Cat> rowMapper = new BeanPropertyRowMapper(Cat.class);
        Cat cat = jdbcTemplate.queryForObject(sql, new Object[]{catName}, rowMapper);
        return cat;
    }
}
