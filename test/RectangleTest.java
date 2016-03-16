import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void representShouldReturnTheRepresentationOfTheRectangle() throws Exception {
        Rectangle rectangle = new Rectangle(10, 5);
        int area = rectangle.calculateArea();
        assertEquals(50,area);
    }
}