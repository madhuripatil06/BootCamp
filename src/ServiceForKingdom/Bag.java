package ServiceForKingdom;

import java.util.ArrayList;
import java.util.HashMap;

public class Bag {
    private final int maxCapacity = 12;
    private ArrayList<Ball> balls = new ArrayList<>(maxCapacity);
    private HashMap<String , Integer>counts;

    public Bag() {
        this.counts = new HashMap<>();
        counts.put("red",0);
        counts.put("green",0);
        counts.put("blue",0);
    }

    public boolean add(Ball ball) {
        if(isValid(ball))
            return balls.add(ball);
        return false;
    }

    private String getColor(Ball ball){
        String[] colors = {"green","red","blue"};
        for (String color : colors) {
            if (ball.isOfColor(color))
                return color;
        }
        return null;
    }

    private boolean isValid(Ball ball) {
        int capacityForBlue = maxCapacity - (counts.get("green")+counts.get("red"));

        String key = getColor(ball);
        HashMap<String, Integer> capacity = new HashMap<>();
        capacity.put("green",3);
        capacity.put("red",2*counts.get("green"));
        capacity.put("blue", capacityForBlue);

        if(capacity.get(key) > counts.get(key)){
            int count = counts.get(key);
            counts.replace(key,count+1);
            return true;
        }
        return false;
     }
}
