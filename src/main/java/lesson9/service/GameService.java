package lesson9.service;

import lesson9.User;

public interface GameService {

    void validate(int gameBet, int balance);
    boolean play(int userNumber);
    void change(User user, int gameBet, boolean result);
}
