/*
    job of RectangleTest :
            - test all the test cases for the Rectangle.
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void calculateAreaShouldReturnTheAreaOfTheRectangle() throws Exception {
        Rectangle rectangle = Rectangle.create(10,5);
        double area = rectangle.calculateArea();
        double expected = 50;
        assertEquals(expected, area,0.0);
    }

    @Test
    public void calculatePerimeterShouldReturnThePerimeterOfTheRectangle() throws Exception {
        Rectangle rectangle = Rectangle.create(2.5,6.5);
        double  area = rectangle.calculatePerimeter();
        double expected = 18;
        assertEquals(expected,area,0.0);
    }
}