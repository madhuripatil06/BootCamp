package Shape;

/*
        job of the Square :
                - calculate attributes of the square.
 */
public class Square extends Shape.Rectangle {
    private Square(double size) {
        super(size,size);
    }

    public static Square create(double size){
        if(size <= 0)
            throw new IllegalArgumentException("Positive value expected but, got "+size);
        return new Square(size);
    }
}
