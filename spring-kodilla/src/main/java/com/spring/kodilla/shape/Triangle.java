package com.spring.kodilla.shape;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {
    @Override
    public String getShapeName() {
        return "This is a triangle";
    }
}
