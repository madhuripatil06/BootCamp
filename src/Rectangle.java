/*
job of Rectangle:
        - calculate any calculation involving height and/or width.
                                            or
        - calculate any property of the rectangle.
 */
public class Rectangle {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculateArea() {
        return height * width;
    }

    public double calculatePerimeter() {
        return  2*(height+width);
    }
}
