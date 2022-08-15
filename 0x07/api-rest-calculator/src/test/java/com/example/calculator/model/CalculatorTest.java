package com.example.calculator.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public  class CalculatorTest {
    private static Calculator calculator;

    @BeforeEach
    public static void setup() {
        Calculator calculator = new Calculator();
    }

    @Test
    void sumTest() {
        Assertions.assertEquals(Double.valueOf(150), calculator.sum(80.0, 70.0));

    }

    @Test
    public void numbersNullSumTest() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            calculator.sum(null, 50.0);
        });
    }

    @Test
    void subTest() {
        Assertions.assertEquals(Double.valueOf(10), calculator.sub(80.0, 70.0));
    }

    @Test
    void divideTest() {
        Assertions.assertEquals(Double.valueOf(2), calculator.divide(80.0, 70.0));
    }

    @Test
    public void divisionByZeroTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(0.0, 10.0);
        });
    }

    @Test
    void factorialTest() {
        Assertions.assertEquals(240, calculator.factorial(10));
    }

    @Test
    void integerToBinaryTest() {
        Assertions.assertEquals(101, calculator.integerToBinary(5));
    }

    @Test
    void integerToHexadecimalTest() {
        Assertions.assertEquals("AA", calculator.integerToHexadecimal(170));
    }

    @Test
    void calculeDayBetweenDateTest() {
        LocalDate day1 = LocalDate.of(2022,9,10);
        LocalDate day2 = LocalDate.of(2022,9,15);

        Assertions.assertEquals(5, calculator.calculeDayBetweenDate(day1, day2));
    }

}
