/*
    job of RectangleTest :
            - test all the test cases for the Rectangle.
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void calculateAreaShouldReturnTheAreaOfTheRectangleGivenTheIntegers(){
        Rectangle rectangle = new Rectangle(10, 5);
        double area = rectangle.calculateArea();
        double expected = 50;
        assertEquals(expected, area,0.0);
    }

    @Test
    public void calculateAreaShouldReturnTheAreaOfTheRectIfFloatIsProvided(){
        Rectangle rectangle = new Rectangle(2.5, 6.5);
        double  area = rectangle.calculateArea();
        double expected = 16.25;
        assertEquals(expected,area,0.0);
    }

    @Test
    public void calculatePerimeterShouldReturnThePerimeterOfTheRectangleGivenTheIntegers (){
        Rectangle rectangle = new Rectangle(4,5);
        double perimeter = rectangle.calculatePerimeter();
        assertEquals(18,perimeter,0.0);
    }

    @Test
    public void calculatePerimeterShouldReturnThePerimeterOfTheRectGivenTheDoubles(){
        Rectangle rectangle = new Rectangle(2.5, 6.5);
        double  area = rectangle.calculatePerimeter();
        double expected = 18;
        assertEquals(expected,area,0.0);

    }
}