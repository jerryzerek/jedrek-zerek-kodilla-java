package com.spring.kodilla.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
    @Autowired
    private Display display;

    public void add(double a, double b) {
        double resultOfAdding = a + b;
        display.displayValue(resultOfAdding);
    }

    public void sub(double a, double b) {
        double resultOfSubstracting = a - b;
        display.displayValue(resultOfSubstracting);
    }

    public void mul(double a, double b) {
        double resultOfMultiplying = a * b;
        display.displayValue(resultOfMultiplying);

    }

    public void div(double a, double b) {
        double resultOfDividing = a / b;
        display.displayValue(resultOfDividing);
    }
}


