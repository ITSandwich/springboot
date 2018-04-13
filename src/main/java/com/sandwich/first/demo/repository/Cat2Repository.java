package com.sandwich.first.demo.repository;

import com.sandwich.first.demo.bean.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

public interface Cat2Repository extends PagingAndSortingRepository<Cat,Long> {

    Cat findByCatName(String catName);

    @Query("from Cat where catName=:cn")
    Cat findMyCat(@Param("cn") String catName);
}
