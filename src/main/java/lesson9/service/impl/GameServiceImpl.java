package lesson9.service.impl;

import lesson9.User;
import lesson9.exc.FinishGame;
import lesson9.exc.IncorrectBet;
import lesson9.exc.NumberOutOfRange;
import lesson9.service.GameService;

public class GameServiceImpl implements GameService {
    @Override
    public void validate(int gameBet, int balance) throws IncorrectBet{
        // изменила условие "ставка меньше, чем сумма на счете пользователя" на меньше или равно,
        // чтобы в дальнейшем нормально отрабатывала проверка на то, что баланс равен 0.
        if (gameBet <= balance && gameBet < 100) {
            System.out.println("The bet has been accepted.");
        }
        else {
            throw new IncorrectBet();
        }
    }

    @Override
    public boolean play(int userNumber) throws NumberOutOfRange{

        int randomNumber = (int) (Math.random() * 6);
        System.out.println("Generated number is " + randomNumber);

        if (userNumber >= -1 && userNumber <= 5) {
            if (userNumber == -1) {
                throw new FinishGame("Unfortunately, you are leaving the game.");
            }
        }
        else {
            throw new NumberOutOfRange();
        }

        if (userNumber == randomNumber) {
            System.out.println("Congratulations, you guessed it!");
            return true;
        }
        else {
            System.out.println("Sorry, you guessed wrong.");
            return false;
        }
    }

    @Override
    public void change(User user, int gameBet, boolean result) {
        int balance;

        if (result) {
            balance = user.getBalance() + gameBet;
            user.setBalance(balance);
        }

        else {
            balance = user.getBalance() - gameBet;
            user.setBalance(balance);
        }
    }
}
