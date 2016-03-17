import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SquareTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void createSquareShouldThrowExceptionForThenegativeNumber() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Positive value expected but, got -9");
        Square.create(-9);
    }

    @Test
    public void createSquareShouldThrowExceptionForzero() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Positive value expected but, got 0");
        Square.create(0);
    }
}