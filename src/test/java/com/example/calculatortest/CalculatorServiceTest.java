package com.example.calculatortest;

import org.junit.Before;
import org.junit.Test;

import static com.example.calculatortest.TestParams.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    private CalculatorService calculatorService;
    private static final TestParams testParams = new TestParams();
    @Before
    public void setUp(){
        calculatorService = new CalculatorService();
    }

    @Test
    public void sum(){
       int actual1 = calculatorService.sum(NUM_1, NUM_2);
       int expected1 = NUM_1 + NUM_2;

        int actual2 = calculatorService.sum(NUM_3, NUM_4);
        int expected2 = NUM_3 + NUM_4;

       assertEquals(expected1, actual1);
       assertEquals(expected2, actual2);
    }

    @Test
    public void difference(){
        int actual1 = calculatorService.difference(NUM_2, NUM_3);
        int expected1 = NUM_2 - NUM_3;

        int actual2 = calculatorService.difference(NUM_1, NUM_4);
        int expected2 = NUM_1 - NUM_4;

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void multiply(){
        int actual1 = calculatorService.multiply(NUM_1, NUM_3);
        int expected1 = NUM_1 * NUM_3;

        int actual2 = calculatorService.multiply(NUM_2, NUM_4);
        int expected2 = NUM_2 * NUM_4;

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void divide(){
        double actual1 = calculatorService.divide(NUM_1, NUM_3);
        double expected1 = (double) NUM_1 / NUM_3;

        double actual2 = calculatorService.divide(NUM_2, NUM_3);
        double expected2 = (double) NUM_2 / NUM_3;

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenDivideOnZero(){
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(NUM_1, NUM_4));
    }
}
