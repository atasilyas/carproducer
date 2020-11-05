package com.vodafone.assigment.carproducer.controller;


import com.vodafone.assigment.carproducer.config.ApiPaths;
import com.vodafone.assigment.carproducer.service.factories.CarFactory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPaths.CarPath.CTRL)
@Api(value = ApiPaths.CarPath.CTRL, description = "Car APIs", produces = "Json", consumes = "Json", protocols = "HTTP")
@RequiredArgsConstructor
public class CarController
{
    private final CarFactory carFactory;

    @GetMapping("/{carType}")
    @ApiOperation(value = "Produce Car Operation", response = String.class)
    public ResponseEntity<?> produceCar(@PathVariable String carType)
    {
        return ResponseEntity.ok(carFactory.produceCar(carType).getType());
    }
}
