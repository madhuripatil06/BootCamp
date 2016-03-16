import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void calculateAreaShouldReturnTheAreaOfTheRectangle() throws Exception {
        Rectangle rectangle = new Rectangle(10, 5);
        int area = rectangle.calculateArea();
        assertEquals(50,area);
    }

    @Test
    public void calculatePerimeterShouldReturnThePerimeterOfTheRectangle () throws Exception {
        Rectangle rectangle = new Rectangle(4,5);
        int perimeter = rectangle.calculatePerimeter();
        Assert.assertEquals(18,perimeter);
    }

}