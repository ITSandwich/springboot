package com.sandwich.first.demo.repository;

import com.sandwich.first.demo.bean.Cat;
import org.springframework.data.repository.CrudRepository;

public interface CatRepository extends CrudRepository<Cat,Long>{
}
