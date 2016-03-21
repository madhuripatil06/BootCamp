package ServiceForKingdom;

public class Ball {
    private Color color;

    public Ball(Color color) {
        this.color = color;
    }

    public boolean isOfColor(String otherColor) {
        return color.toText().equals(otherColor);
    }
}
