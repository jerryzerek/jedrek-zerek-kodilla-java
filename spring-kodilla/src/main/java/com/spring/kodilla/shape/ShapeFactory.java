package com.spring.kodilla.shape;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class ShapeFactory{
    @Bean
    public Square createSquare() {
        return new Square();
    }


    @Bean
    public Shape chosenShape() {
        Shape shape;
        Random generator = new Random();
        int chosen = generator.nextInt(3);
        if (chosen == 0) {
            shape = new Circle();
        } else if (chosen == 1) {
            shape = new Triangle();
        } else {
            shape = new Square();
        }


        return shape;
    }
}
