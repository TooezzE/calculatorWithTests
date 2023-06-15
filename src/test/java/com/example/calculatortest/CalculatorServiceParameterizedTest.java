package com.example.calculatortest;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.calculatortest.TestParams.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceParameterizedTest {

    private final CalculatorService calculatorService = new CalculatorService();

    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(NUM_1, NUM_2, "sum"),
                Arguments.of(NUM_2, NUM_3, "sum"),
                Arguments.of(NUM_3, NUM_4, "diff"),
                Arguments.of(NUM_4, NUM_1, "diff"),
                Arguments.of(NUM_2, NUM_2, "multiply"),
                Arguments.of(NUM_1, NUM_3, "multipy"),
                Arguments.of(NUM_1, NUM_3, "divide"),
                Arguments.of(NUM_2, NUM_1, "divide")
        );
    }

        @ParameterizedTest
        @MethodSource("provideParamsForTest")
        public void shouldGiveCorrectResultOfOperation(int num1, int num2, String operation){
            if(operation.equals("sum")){

                int result = calculatorService.sum(num1, num2);
                assertEquals(num1+num2, result);

            } else if(operation.equals("diff")){

                int result = calculatorService.difference(num1, num2);
                assertEquals(num1-num2, result);

            } else if(operation.equals("multiply")){

                int result = calculatorService.multiply(num1, num2);
                assertEquals(num1*num2, result);

            } else if(operation.equals("divide")){

                double result = calculatorService.divide(num1, num2);
                assertEquals((double) num1/num2, result);
            }
        }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenDivideOnZero(){
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(NUM_1, NUM_4));
    }
}
