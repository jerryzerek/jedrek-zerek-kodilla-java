package com.spring.kodilla.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.kodilla");
        //When
        Calculator calculator = context.getBean(Calculator.class);
        calculator.add(10, 5);
        calculator.sub(10, 5);
        calculator.mul(10, 5);
        calculator.div(10, 5);

    }
}
