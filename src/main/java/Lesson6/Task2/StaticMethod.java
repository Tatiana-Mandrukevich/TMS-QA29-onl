/*Необходимо создать статический метод, который принимает строку и число.
Его задача вывести строку указанное количество раз.*/

package Lesson6.Task2;

public class StaticMethod {
    public static void printString(String string, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(string);
        }
    }
}
