public class NonPositiveException  extends Throwable{

    public NonPositiveException(double height , double width) {
        super("expected positive height and width but, got "+height + " , "+width);
    }
}
