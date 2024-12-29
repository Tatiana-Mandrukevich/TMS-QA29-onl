package lesson9.exc;

public class FinishGame extends RuntimeException {
    public FinishGame(String message) {
        super(message);
    }
}
