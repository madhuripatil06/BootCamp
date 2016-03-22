package Wizard;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class BagTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void bagShouldHoldTheBalls() throws InvalidPositionException {
        Bag bag = new Bag();
        Ball green = new Ball(Color.GREEN);
        boolean result = bag.add(green);
        assertTrue(result);
    }


    @Test
    public void bagShouldNotAllowUserToAddMoreThan3GreenBalls() throws InvalidPositionException {
        Bag bag = new Bag();
        Ball greenBall = new Ball(Color.GREEN);
        boolean first =bag.add(greenBall);
        assertTrue(first);
        boolean second = bag.add(greenBall);
        assertTrue(second);
        boolean third = bag.add(greenBall);
        assertTrue(third);
        thrown.expect(InvalidPositionException.class);
        bag.add(greenBall);
    }

    @Test
    public void bagShouldNotAllowUserToAddMoreThanDoubleOFGreenBalls() throws InvalidPositionException {
        Bag bag  = new Bag();
        Ball greenBall = new Ball(Color.GREEN);
        Ball redBall = new Ball(Color.RED);
        boolean first = bag.add(greenBall);
        assertTrue(first);
        boolean second = bag.add(greenBall);
        assertTrue(second);
        boolean third = bag.add(redBall);
        assertTrue(third);
        boolean fourthRed = bag.add(redBall);
        assertTrue(fourthRed);
        boolean fifth = bag.add(redBall);
        assertTrue(fifth);
        thrown.expect(InvalidPositionException.class);
        bag.add(redBall);
    }

    @Test
    public void bagShouldBeAbleToHold12BlueBalls()throws InvalidPositionException  {
        Bag bag = new Bag();
        Ball ball = new Ball(Color.BLUE);
        for(int i = 0 ; i < 12 ; i++) {
            assertTrue(bag.add(ball));
        }
        thrown.expect(InvalidPositionException.class);
        bag.add(ball);
    }

    @Test
    public void bagShouldNotHoldFirstYellowBall() throws InvalidPositionException {
        Bag bag = new Bag();
        Ball yellowBall = new Ball(Color.YELLOW);
        thrown.expect(InvalidPositionException.class);
        bag.add(yellowBall);
    }

    @Test
    public void bagShouldBeAbleToHoldMaximum40percentOfYellowBalls()throws InvalidPositionException  {
        Bag bag = new Bag();
        Ball yellowBall = new Ball(Color.YELLOW);
        Ball blueBall = new Ball(Color.BLUE);
        bag.add(blueBall);
        bag.add(blueBall);
        boolean result = bag.add(yellowBall);
        assertTrue(result);
    }

    @Test
    public void bagShouldBeAbleToHoldTheSummaryAtAnyPointOfTime()throws InvalidPositionException  {
        Bag bag = new Bag();
        Ball blueBall = new Ball(Color.BLUE);
        Ball ball = new Ball(Color.GREEN);
        bag.add(blueBall);
        String summary = bag.getSummary();
        String expectedSummary = "Bag : 1 Balls  \nBLUE : 1\n";
        assertEquals(expectedSummary ,summary);
        bag.add(blueBall);
        String expectedSummary2 = "Bag : 2 Balls  \nBLUE : 2\n";
        String summary2 = bag.getSummary();
        System.out.println(summary2);
        assertEquals(expectedSummary2 ,summary2);
    }
}