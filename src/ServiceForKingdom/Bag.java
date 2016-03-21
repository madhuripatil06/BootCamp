package ServiceForKingdom;

import java.util.ArrayList;
import java.util.HashMap;

public class Bag {
    private final int capacity = 12;
    private ArrayList<Ball> balls = new ArrayList<>(capacity);
    private HashMap<String , Integer>counts;

    public Bag() {
        this.counts = new HashMap<>();
        counts.put("red",0);
        counts.put("green",0);
        counts.put("blue",0);
    }

    public boolean add(Ball ball) {
        return isValid(ball);
    }

    private boolean isValid(Ball ball) {
        HashMap<String, Integer> capacity = new HashMap<>();
        capacity.put("green",3);
        capacity.put("red",2*counts.get("green"));
        int capacityForBlue = counts.get("green")+counts.get("red");
        capacity.put("blue",(12 - capacityForBlue));
        String key = ball.getColor();
        if(capacity.get(key) > counts.get(key)){
            int count = counts.get(key);
            counts.replace(key,count+1);
            balls.add(ball);
            return true;
        }
        return false;
     }
}
