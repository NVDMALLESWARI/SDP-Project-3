package com.project.jfsd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.jfsd.model.Cars;
@Repository
public interface CarRepository extends CrudRepository<Cars,Integer>{

}
