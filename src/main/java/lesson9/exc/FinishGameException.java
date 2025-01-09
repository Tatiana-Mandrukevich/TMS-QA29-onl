package lesson9.exc;

public class FinishGameException extends RuntimeException {
    public FinishGameException(String message) {
        super(message);
    }
}
