package com.vodafone.assigment.carproducer.service.impl;

import com.vodafone.assigment.carproducer.service.Car;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;

@Description(value = "Cabrio Car implementation.")
@Service("cabrioCarService")
public class CabrioCarService implements Car
{
    @Override
    public String getType() {
        return "Cabrio Car Has Produced.";
    }
}
