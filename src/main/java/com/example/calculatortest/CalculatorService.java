package com.example.calculatortest;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int sum(Integer num1, Integer num2){
        if(num1 == null || num2 == null){
            throw new IllegalArgumentException();
        }
        return num1 + num2;
    }

    public int difference(Integer num1, Integer num2){
        if(num1 == null || num2 == null){
            throw new IllegalArgumentException();
        }
        return num1 - num2;
    }

    public int multiply(Integer num1, Integer num2){
        if(num1 == null || num2 == null){
            throw new IllegalArgumentException();
        }
        return num1 * num2;
    }

    public double divide(Integer num1, Integer num2){
        if(num1 == null || num2 == null || num2 == 0){
            throw new IllegalArgumentException();
        }
        return (double) num1/num2;
    }
}