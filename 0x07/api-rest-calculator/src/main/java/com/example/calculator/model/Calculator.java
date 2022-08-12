package com.example.calculator.model;

import java.time.LocalDate;


import static java.time.temporal.ChronoUnit.DAYS;

public class Calculator {

    public Double sum(Double number1, Double number2) {
        if(number1 == null || number2 == null){
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }
        return number1 + number2;
    }

    public Double sub(Double number1, Double number2) {
        if(number1 == null || number2 == null){
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }
        return number1 - number2;
    }

    public Double divide (Double number1, Double number2)  {
        if(number1 == null || number2 == null){
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }

        if(number1 == 0 || number2 == 0){
            throw new ArithmeticException("Divisão por zero não é permitido.");
        }

        return number1 / number2;
    }

    public Integer factorial(Integer factorial) {
        if (factorial == null) {
            throw new NullPointerException("Número é obrigatório.");
        }

        for (int i = 1; true; i ++ ) {
            factorial *= i;
        }
    }

    public Integer integerToBinary(Integer integer) {
        return Integer.parseInt(Integer.toBinaryString(integer));

    }

    public String integerToHexadecimal(Integer integer) {
        return Integer.toHexString(integer);
    }

    public int calculeDayBetweenDate(LocalDate date1, LocalDate date2) {
        LocalDate dateBefore = date1;
        LocalDate dateAfter = date2;
        long daysBetween = DAYS.between(dateBefore, dateAfter);
        return (int) daysBetween;
    }

}


