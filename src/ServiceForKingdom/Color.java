package ServiceForKingdom;

public enum Color {
    GREEN("green"),
    RED("red"),
    BLUE("blue");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String toText(){
        return color;
    }
}
