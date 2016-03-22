package Wizard;

import java.util.ArrayList;
import java.util.HashMap;

public class Bag {
    private final int maxCapacity = 12;
    private final int maxCapacityForGreen = 3;
    private Ball previousBall;
    private String data = "";
    private String summary = "";
    private ArrayList<Ball> balls = new ArrayList<>(maxCapacity);
    private HashMap<Color , Integer>counts;

    public Bag() {
        this.counts = new HashMap<>();
        counts.put(Color.RED,0);
        counts.put(Color.GREEN,0);
        counts.put(Color.BLUE,0);
        counts.put(Color.YELLOW,0);
    }

    public boolean add(Ball ball) throws InvalidPositionException {
        if(isValid(ball)) {
            setSummary(ball);
            return balls.add(ball);
        }
        throw new InvalidPositionException();
    }

    private void setSummary(Ball ball) {
//        String summary1 = "Bag : "+(getTotalNumberOfBalls())+" Balls  \n";
//        for (Ball aBall : balls) {
//            int count1 = 1 ;
//            if(previousBall != null && previousBall.isOfColor(getColor(aBall)))
//                count1 += 1;
//            summary += aBall.toString() + count1;
//            Ball previousBall = ball;
//        }
//        System.out.println(" ------ " +summary1);


        int count = 1;
        if(previousBall != null && previousBall.isOfColor(getColor(ball))) {
            int countLength = 3;
            data = data.substring(0,data.length()-countLength);
            count += 1;
            data += " " +count +"\n";
        }
        else {
            data += getColor(ball).toString() + " : " + count + "\n";
            previousBall = ball;
        }
        summary ="Bag : "+(getTotalNumberOfBalls())+" Balls  \n"+data;
    }

    private Color getColor(Ball ball){
        Color[] colors = {Color.GREEN,Color.RED,Color.BLUE,Color.YELLOW};
        for (Color color : colors) {
            if (ball.isOfColor(color))
                return color;
        }
        return null;
    }

    private int setCapacityForRed(){
        int noOfGreenBalls = counts.get(Color.GREEN);
        if(noOfGreenBalls == 1)
            return 0;
        return 2*counts.get(Color.GREEN)-1;
    }

    private int getTotalNumberOfBalls(){
        return counts.get(Color.BLUE)+counts.get(Color.RED)+counts.get(Color.GREEN)+counts.get(Color.YELLOW);
    }

    private boolean isValid(Ball ball) {
        int capacityForYellow = (int)((getTotalNumberOfBalls()+1)*(40d/100));
        int capacityForBlue = maxCapacity - (counts.get(Color.GREEN)+counts.get(Color.RED));
        int capacityForRed = setCapacityForRed();
        Color color = getColor(ball);

        HashMap<Color, Integer> capacity = new HashMap<>();
        capacity.put(Color.GREEN,maxCapacityForGreen);
        capacity.put(Color.RED,capacityForRed);
        capacity.put(Color.BLUE, capacityForBlue);
        capacity.put(Color.YELLOW, capacityForYellow);
        if(capacity.get(color) > counts.get(color)){
            int count = counts.get(color);
            counts.replace(color,count+1);
            return true;
        }
        return false;
     }

    public String getSummary(){
        return summary;
    }
}
