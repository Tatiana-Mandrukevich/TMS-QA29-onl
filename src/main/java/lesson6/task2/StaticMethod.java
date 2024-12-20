/*Необходимо создать статический метод, который принимает строку и число.
Его задача вывести строку указанное количество раз.*/

package lesson6.task2;

public class StaticMethod {
    public static void printString(String string, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(string);
        }
    }
}
