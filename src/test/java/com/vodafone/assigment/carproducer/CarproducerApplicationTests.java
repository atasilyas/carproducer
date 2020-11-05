package com.vodafone.assigment.carproducer;

import com.vodafone.assigment.carproducer.model.CarType;
import com.vodafone.assigment.carproducer.service.factories.CarFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;


@SpringBootTest
class CarproducerApplicationTests
{
    @Autowired
    private CarFactory carFactory;

    @Test
    public void whenTypeIsCabrio_shouldProduceCabrio()
    {
        String result = carFactory.produceCar(CarType.CABRIO.toString()).getType();
        assertNotNull(result);
        assertEquals(result, "Cabrio Car Has Produced.");
    }

    @Test
    public void whenTypeIsSedan_shouldProduceSedan()
    {
        String result = carFactory.produceCar(CarType.SEDAN.toString()).getType();
        assertNotNull(result);
        assertEquals(result, "Sedan Car Has Produced.");
    }

    @Test
    public void whenTypeIsInvalid_shouldThrowException() throws Exception
    {
        boolean exceptionHandeled = false;
        try
        {
            carFactory.produceCar(CarType.INVALID.toString()).getType();
        }
        catch (IllegalArgumentException ex)
        {
            exceptionHandeled = true;
        }
        assertTrue(exceptionHandeled);
    }
}
