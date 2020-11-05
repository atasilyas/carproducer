package com.vodafone.assigment.carproducer.service.factories;

import com.vodafone.assigment.carproducer.model.CarType;
import com.vodafone.assigment.carproducer.service.Car;
import com.vodafone.assigment.carproducer.service.impl.CabrioCarService;
import com.vodafone.assigment.carproducer.service.impl.SedanCarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class CarFactory
{
    @Autowired
    @Lazy
    @Qualifier("cabrioCarService")
    private CabrioCarService cabrioCarService;


    @Autowired
    @Lazy
    @Qualifier("sedanCarService")
    private SedanCarService sedanCarService;


    public Car produceCar(String carType)
    {
        if (CarType.CABRIO.toString().equalsIgnoreCase(carType))
        {
            return cabrioCarService;
        }
        else if (CarType.SEDAN.toString().equalsIgnoreCase(carType))
        {
            return sedanCarService;
        }else
        {
            throw new IllegalArgumentException("Provided carType not found.");
        }
    }


}
