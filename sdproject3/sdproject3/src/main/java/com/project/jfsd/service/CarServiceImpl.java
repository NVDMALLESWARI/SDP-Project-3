package com.project.jfsd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.jfsd.model.Cars;
import com.project.jfsd.repository.CarRepository;

@Service
public class CarServiceImpl implements CarService
{
    @Autowired
    private CarRepository carrepository;
    
	@Override
	public Cars addCar(Cars car) 
	{
		return carrepository.save(car);
	}

}
