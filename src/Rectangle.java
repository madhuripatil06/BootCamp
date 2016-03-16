public class Rectangle {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int calculateArea() {
        return height * width;
    }


    public int calculatePerimeter() {
        return  2*(height+width);
    }
}
