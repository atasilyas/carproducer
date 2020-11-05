package com.vodafone.assigment.carproducer.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GlobalResponse
{

    private Date date;
    private String message;
}
