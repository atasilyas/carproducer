package com.vodafone.assigment.carproducer.service.impl;

import com.vodafone.assigment.carproducer.service.Car;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;

@Description(value = "Sedan Car implementation.")
@Service("sedanCarService")
public class SedanCarService implements Car
{
    @Override
    public String getType() {
        return "Sedan Car Has Produced.";
    }
}
