package com.spring.kodilla;

import com.spring.kodilla.shape.Circle;
import com.spring.kodilla.shape.Shape;
import com.spring.kodilla.shape.Square;
import com.spring.kodilla.shape.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringKodillaApplicationTests {

    @Test
    public void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.kodilla");

        //When
        Shape shape =  (Shape) context.getBean("circle");
        String result = shape.getShapeName();

        //Then
        Assert.assertEquals("This is a circle", result);
    }

    @Test
    public void testTriangleLoadedIntoContainer() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.kodilla");
        Shape shape = (Shape) context.getBean("triangle");

        //When
        String name = shape.getShapeName();

        //Then
        Assert.assertEquals("This is a triangle", name);
    }

    @Test
    public void testSquareLoadedIntoContainter() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.kodilla");
        Shape shape = (Shape) context.getBean("createSquare");

        //When
        String name = shape.getShapeName();

        //Then
        Assert.assertEquals("This is a square", name);
    }


    @Test
    public void testShapeLoadedIntoContainter() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.kodilla");

        //When
        Shape shape = (Shape) context.getBean("chosenShape");
        String name = shape.getShapeName();

        //Then
        System.out.println("Chosen shape says: " + name);
    }


}

