package Lesson4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Массив: ");
        int[] Mass = new int[10]; // создала массив с определенным размером - 10 значений
        for (int i = 0; i < Mass.length; i++) { // цикл для записи значений в массив
            Random NumberForMass = new Random(); // создала класс рандом для генерации числа
            int Number = NumberForMass.nextInt(0, 1000); // создала переменную, в которую будет присваиваться рандомное значение с 0 до 1000
            Mass[i] = Number; // присвоила рандомное значение элементу в массиве
            System.out.print(Mass[i] + " ");
        }
        int Amount = 0; // переменная "Количество элементов в массиве"
        int Sum = 0; // переменная "Сумма элементов в массиве"
        int Max = Mass[0]; // переменная "Максимальный элемент в массиве"
        int Min = Mass[0]; // переменная "Минимальный элемент в массиве"
        for (int i = 0; i < Mass.length; i++) {// цикл для чтения массива
            Amount++; // каждая итерация = 1 элемент массива
            Sum += Mass[i]; // к сумме добавляю каждый элемент массива
            if (Mass[i] > Max) { // поиск максимального значения
                Max = Mass[i];
            }
            if (Mass[i] < Min) { // поиск минимального значения
                Min = Mass[i];
            }
        }
        System.out.println();
        System.out.println("Количество элементов в массиве: " + Amount);
        System.out.println("Сумма элементов в массиве: " + Sum);
        System.out.println("Максимальный элемент в массиве: " + Max);
        System.out.println("Минимальный элемент в массиве: " + Min);
    }
}
