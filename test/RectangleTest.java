/*
    job of RectangleTest :
            - test all the test cases for the Rectangle.
 */
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Rule
    public  ExpectedException thrown = ExpectedException.none();

    @Test
    public void calculateAreaShouldReturnTheAreaOfTheRectangle() throws IllegalArgumentException{
        Rectangle rectangle = Rectangle.create(10,5);
        double area = rectangle.calculateArea();
        double expected = 50;
        assertEquals(expected, area,0.0);
    }

    @Test
    public void calculatePerimeterShouldReturnThePerimeterOfTheRectangle() throws IllegalArgumentException{
        Rectangle rectangle = Rectangle.create(2.5,6.5);
        double  area = rectangle.calculatePerimeter();
        double expected = 18;
        assertEquals(expected,area,0.0);
    }

    @Test
    public void rectangleShouldNotBeCreateForHeightAndOrWidthZero() throws IllegalArgumentException{
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Expected Positive height and width but got, height : 0.0 and width : 0.0");
        Rectangle.create(0,0);
    }

    @Test
    public void rectangleShouldNotBeCreatedForNegativeHeightOrWidth() throws IllegalArgumentException{
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Expected Positive height and width but got, height : 2.0 and width : -9.0");
        Rectangle.create(2,-9);
    }
}