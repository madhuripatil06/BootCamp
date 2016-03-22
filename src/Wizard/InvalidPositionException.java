package Wizard;

public class InvalidPositionException extends Throwable {
    public InvalidPositionException() {
        super("position is getting violated ");
    }
}
