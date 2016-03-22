package Wizard;

public class Ball {
    private Color color;

    public Ball(Color color) {
        this.color = color;
    }

    public boolean isOfColor(Color otherColor) {
        return color.equals(otherColor);
    }
}
