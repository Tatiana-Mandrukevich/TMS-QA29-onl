/*Есть список пользователей (имя - может дублироваться, возраст - уникальное).
Необходимо вывести список всех существующих имен без дубликатов.
Необходимо вывести список всех пользователей в порядке увеличения возраста.*/

package lesson11.task2;

import lesson11.task2.service.UserService;
import lesson11.task2.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        List<User> originalCollection = new ArrayList<>();

        originalCollection.add(new User("Ivan", 30));
        originalCollection.add(new User("Vera", 20));
        originalCollection.add(new User("Max", 10));
        originalCollection.add(new User("Irina", 22));
        originalCollection.add(new User("Ivan", 35));
        originalCollection.add(new User("Irina", 25));
        originalCollection.add(new User("Vera", 28));
        originalCollection.add(new User("Anton", 31));
        originalCollection.add(new User("Max", 50));
        originalCollection.add(new User("Anna", 45));

        System.out.println("Original collection: " + originalCollection);

        UserService userService = new UserServiceImpl();

        System.out.println("Collection with unique names: " + userService.getUniqueNames(originalCollection));

        System.out.println("Collection of users sorted by increasing age (age = name): " + userService.getSortByAge(originalCollection));
    }
}
