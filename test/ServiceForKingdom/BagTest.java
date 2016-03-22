package ServiceForKingdom;

import org.junit.Test;

import static org.junit.Assert.*;

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
        boolean second = bag.add(greenBall);
        assertTrue(second);
        boolean third = bag.add(redBall);
        assertTrue(third);
        boolean fourthRed = bag.add(redBall);
        assertTrue(fourthRed);
        boolean fifth = bag.add(redBall);
        assertTrue(fifth);
        boolean six = bag.add(redBall);
        assertFalse(six);
    }

    @Test
    public void bagShouldBeAbleToHold12BlueBalls() {
        Bag bag = new Bag();
        Ball ball = new Ball(Color.BLUE);
        for(int i = 0 ; i < 12 ; i++) {
            assertTrue(bag.add(ball));
        }
        boolean result = bag.add(ball);
        assertFalse(result);
    }

    @Test
    public void bagShouldNotHoldFirstYellowBall() {
        Bag bag = new Bag();
        Ball yellowBall = new Ball(Color.YELLOW);
        boolean result = bag.add(yellowBall);
        assertFalse(result);
    }

    @Test
    public void bagShouldBeAbleToHoldMaximum40percentOfYellowBalls() {
        Bag bag = new Bag();
        Ball yellowBall = new Ball(Color.YELLOW);
        Ball blueBall = new Ball(Color.BLUE);
        bag.add(blueBall);
        bag.add(blueBall);
        boolean result = bag.add(yellowBall);
        assertTrue(result);
    }

    @Test
    public void bagShouldBeAbleToHoldTheSummaryAtAnyPointOfTime() {
        Bag bag = new Bag();
        Ball blueBall = new Ball(Color.BLUE);
        Ball ball = new Ball(Color.GREEN);
        bag.add(blueBall);
        String summary = bag.getSummary();
        String expectedSummary = "Bag : 1 Balls  \nBLUE : 1 ";
        assertEquals(expectedSummary ,summary);
        bag.add(blueBall);
        String expectedSummary2 = "Bag : 2 Balls  \nBLUE : 2";
        String summary2 = bag.getSummary();
        System.out.println(summary2);
        assertEquals(expectedSummary2 ,summary2);
    }

//    @Test
//    public void bagShouldProvideTheSummary() {

//    }
}