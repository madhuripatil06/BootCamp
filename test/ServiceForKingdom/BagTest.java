package ServiceForKingdom;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BagTest {

    @Test
    public void bagShouldHoldTheBalls() {
        Bag bag = new Bag();
        Ball green = new Ball(Color.GREEN);
        boolean result = bag.add(green);
        assertTrue(result);
    }


    @Test
    public void bagShouldNotAllowUserToAddMoreThan3GreenBalls() {
        Bag bag = new Bag();
        Ball greenBall = new Ball(Color.GREEN);
        boolean first =bag.add(greenBall);
        assertTrue(first);
        boolean second = bag.add(greenBall);
        assertTrue(second);
        boolean third = bag.add(greenBall);
        assertTrue(third);
        boolean result = bag.add(greenBall);
        assertFalse(result);
    }

    @Test
    public void bagShouldNotAllowUserToAddMoreThanDoubleOFGreenBalls() {
        Bag bag  = new Bag();
        Ball greenBall = new Ball(Color.GREEN);
        Ball redBall = new Ball(Color.RED);
        boolean first = bag.add(greenBall);
        assertTrue(first);
        boolean second = bag.add(redBall);
        assertTrue(second);
        boolean third = bag.add(redBall);
        assertTrue(third);
        boolean fourthRed = bag.add(redBall);
        assertFalse(fourthRed);
        boolean fourth = bag.add(greenBall);
        assertTrue(fourth);
        boolean fifth = bag.add(redBall);
        assertTrue(fifth);
        boolean six = bag.add(redBall);
        assertTrue(six);
        boolean seventh = bag.add(redBall);
        assertFalse(seventh);
    }

    @Test
    public void bagShouldBeAbleToHold12BlueBalls() {
        Bag bag = new Bag();
        Ball ball = new Ball(Color.BLUE);
        for(int i = 0 ; i < 12 ; i++)
            assertTrue(bag.add(ball));
        boolean result = bag.add(ball);
        assertFalse(result);
    }
}