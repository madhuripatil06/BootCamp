package ServiceForKingdom;

import java.util.ArrayList;
import java.util.HashMap;

public class Bag {
    private final int maxCapacity = 12;
    private Ball previousBall;
    private String data;
    private int totalNumberOfBalls;
    private String summary;
    private ArrayList<Ball> balls = new ArrayList<>(maxCapacity);
    private HashMap<Color , Integer>counts;

    public Bag() {
        this.counts = new HashMap<>();
        counts.put(Color.RED,0);
        counts.put(Color.GREEN,0);
        counts.put(Color.BLUE,0);
        counts.put(Color.YELLOW,0);
        this.summary = "";
        this.totalNumberOfBalls = 0;
        this.data = "";
        this.previousBall = null;
    }

    public boolean add(Ball ball) {
        if(isValid(ball)) {
            setSummary(ball);
            return balls.add(ball);
        }
        return false;
    }

    private void setSummary(Ball ball) {
        int count = 1;
        if(previousBall != null && previousBall.isOfColor(getColor(ball))) {
            data = data.substring(0,data.length()-3);
            count += 1;
            data += " " +count;
        }
        else {
            data += getColor(ball).toString() + " : " + count + " ";
            previousBall = ball;
        }
        summary ="Bag : "+(totalNumberOfBalls+1)+" Balls  \n"+data;
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

    private void getTotalNumberOfBalls(){
        totalNumberOfBalls =  counts.get(Color.BLUE)+counts.get(Color.RED)+counts.get(Color.GREEN)+counts.get(Color.YELLOW);
    }

    private boolean isValid(Ball ball) {
        getTotalNumberOfBalls();
        int capacityForYellow = (int)((totalNumberOfBalls+1)*(40d/100));
        int capacityForBlue = maxCapacity - (counts.get(Color.GREEN)+counts.get(Color.RED));
        int capacityForRed = setCapacityForRed();
        Color key = getColor(ball);

        HashMap<Color, Integer> capacity = new HashMap<>();
        capacity.put(Color.GREEN,3);
        capacity.put(Color.RED,capacityForRed);
        capacity.put(Color.BLUE, capacityForBlue);
        capacity.put(Color.YELLOW, capacityForYellow);

        if(capacity.get(key) > counts.get(key)){
            int count = counts.get(key);
            counts.replace(key,count+1);
            return true;
        }
        return false;
     }

    public String getSummary(){
        return summary;
    }
}
