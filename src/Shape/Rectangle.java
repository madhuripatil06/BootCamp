package Shape;/*
job of Rectangle:
        - calculate attributes of rectangle.
 */

public class Rectangle {
    private final double height;
    private final double width;

    protected Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculateArea() {
        return height * width;
    }

    public double calculatePerimeter() {
        return  2*(height+width);
    }

    public static Rectangle create(double height , double width) throws IllegalArgumentException{
        if(!(height > 0) || !(width >0))
            throw new IllegalArgumentException("Expected Positive height and width but got, height : "+height+" and width : "+width);
        return new Rectangle(height,width);
    }
}
