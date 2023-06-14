package com.example.calculatortest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
    private CalculatorService calculatorService;
    private int num1;
    private int num2;
    private int num3;
    private int num4;

    @Before
    public void setUp(){
        calculatorService = new CalculatorService();
        num1 = 28;
        num2 = -168;
        num3 = 7;
        num4 = 0;
    }

    @Test
    public void sum(){
       int actual1 = calculatorService.sum(num1, num2);
       int expected1 = num1+num2;

        int actual2 = calculatorService.sum(num3, num4);
        int expected2 = num3 + num4;

       assertEquals(expected1, actual1);
       assertEquals(expected2, actual2);
    }

    @Test
    public void difference(){
        int actual1 = calculatorService.difference(num2, num3);
        int expected1 = num2 - num3;

        int actual2 = calculatorService.difference(num1, num4);
        int expected2 = num1 - num4;

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void multiply(){
        int actual1 = calculatorService.multiply(num1, num3);
        int expected1 = num1 * num3;

        int actual2 = calculatorService.multiply(num2, num4);
        int expected2 = num2 * num4;

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void divide(){
        double actual1 = calculatorService.divide(num1, num3);
        double expected1 = (double) num1/num3;

        double actual2 = calculatorService.divide(num2, num3);
        double expected2 = (double) num2/num3;

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void divideOnZero(){
        Object actual = calculatorService.divide(num3, num4);
        Object expected = new IllegalArgumentException();

        assertEquals(expected, actual);
    }
}
