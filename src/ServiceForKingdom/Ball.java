package ServiceForKingdom;

public class Ball {
    private Color color;

    public Ball(Color color) {
        this.color = color;
    }

    public String getColor(){
        return color.toText();
    }

}
