/*
job of Rectangle:
        - calculate possible quantities which are related to rectangle based on height and/or width.
                                            or
        - calculate any property of the rectangle using height and/or width.
 */

public class Rectangle {
    private final double height;
    private final double width;

    private Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculateArea() {
        return height * width;
    }

    public double calculatePerimeter() {
        return  2*(height+width);
    }

    public static Rectangle create(double height , double width) throws Exception {
        if(!isValid(height) || !isValid(width))
            throw new Exception("Please enter valid height and width");
        return new Rectangle(height,width);

    }

    private static boolean isValid(double value) {
        return value > 0;
    }
}
