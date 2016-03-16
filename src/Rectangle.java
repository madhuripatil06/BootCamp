/*
job of Rectangle:
        - calculate possible quantities which are related to rectangle based on height and/or width.
                                            or
        - calculate any property of the rectangle using height and/or width.
 */

public class Rectangle {
    private final double height;
    private final double width;

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
