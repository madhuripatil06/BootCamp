package ShapeTest;

import Shape.Square;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SquareTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void createSquareShouldThrowExceptionForTheNegativeNumber() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Positive value expected but, got -9");
        Shape.Square.create(-9);
    }

    @Test
    public void createSquareShouldThrowExceptionForZero() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Positive value expected but, got 0");
        Square.create(0);
    }
}