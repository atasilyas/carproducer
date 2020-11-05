package com.vodafone.assigment.carproducer.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration("swaggerConfigProperties")
public class SwaggerConfigProperties
{
    @Value("${api.version}")
    private String apiVersion;
    @Value("${swagger.title}")
    private String title;
    @Value("${swagger.description}")
    private String description;
}