package lesson9.service.impl;

import lesson9.User;
import lesson9.exc.IncorrectBet;
import lesson9.exc.NumberOutOfRange;
import lesson9.service.GameService;
import lesson9.service.HandlerService;

import java.util.Scanner;

public class HandlerServiceImpl implements HandlerService {

    private String name;
    private int balance;
    private int bet;
    private int number;
    private boolean result;
    private User user;

    @Override
    public User createUser() {
        System.out.println("Enter your name:");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();

        System.out.println("Enter your balance:");
        balance = input.nextInt();

        user = new User(name, balance);

        return user;
    }

    @Override
    public void acceptBetAndNumber() {

        GameService gameService = new GameServiceImpl();

        while (user.getBalance() != 0) {

            System.out.println("Enter your bet:");
            Scanner input = new Scanner(System.in);
            bet = input.nextInt();

            try {
                gameService.validate(bet, user.getBalance());
            } catch (IncorrectBet betExc) {
                System.out.println("Please enter a different game bet.");
                continue;
            }

            System.out.println("Enter your number:");
            number = input.nextInt();
            try {
                result = gameService.play(number);
                break;
            } catch (NumberOutOfRange numberExc) {
                System.out.println("Your number is out of range.");
            }
        }
    }

    @Override
    public void getResult() {

        GameService gameService = new GameServiceImpl();
        gameService.change(user, bet, result);

        if (user.getBalance() == 0) {
            System.out.println("Your balance is 0.");
        }
        else {
            System.out.println("Your balance is " + user.getBalance());
            System.out.println("Do you want to play another game?");
            acceptBetAndNumber();
            getResult();
        }
    }
}
