package ServiceForKingdom;

import java.util.ArrayList;
import java.util.HashMap;

public class Bag {
    private final int maxCapacity = 12;
    private ArrayList<Ball> balls = new ArrayList<>(maxCapacity);
    private HashMap<Color , Integer>counts;

    public Bag() {
        this.counts = new HashMap<>();
        counts.put(Color.RED,0);
        counts.put(Color.GREEN,0);
        counts.put(Color.BLUE,0);
    }

    public boolean add(Ball ball) {
        if(isValid(ball))
            return balls.add(ball);
        return false;
    }

    private Color getColor(Ball ball){
        Color[] colors = {Color.GREEN,Color.RED,Color.BLUE};
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
    private boolean isValid(Ball ball) {
        int capacityForBlue = maxCapacity - (counts.get(Color.GREEN)+counts.get(Color.RED));
        int capacityForRed = setCapacityForRed();
        Color key = getColor(ball);

        HashMap<Color, Integer> capacity = new HashMap<>();
        capacity.put(Color.GREEN,3);
        capacity.put(Color.RED,capacityForRed);
        capacity.put(Color.BLUE, capacityForBlue);

        if(capacity.get(key) > counts.get(key)){
            int count = counts.get(key);
            counts.replace(key,count+1);
            return true;
        }
        return false;
     }
}
