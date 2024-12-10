package Lesson4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Массив: ");
        int[] mass = new int[10]; // создала массив с определенным размером - 10 значений
        for (int i = 0; i < mass.length; i++) { // цикл для записи значений в массив
            Random numberForMass = new Random(); // создала класс рандом для генерации числа
            int number = numberForMass.nextInt(0, 1000); // создала переменную, в которую будет присваиваться рандомное значение с 0 до 1000
            mass[i] = number; // присвоила рандомное значение элементу в массиве
            System.out.print(mass[i] + " ");
        }
        int sum = 0; // переменная "Сумма элементов в массиве"
        int max = mass[0]; // переменная "Максимальный элемент в массиве"
        int min = mass[0]; // переменная "Минимальный элемент в массиве"
        for (int i = 0; i < mass.length; i++) {// цикл для чтения массива
            sum += mass[i]; // к сумме добавляю каждый элемент массива
            if (mass[i] > max) { // поиск максимального значения
                max = mass[i];
            }
            if (mass[i] < min) { // поиск минимального значения
                min = mass[i];
            }
        }
        System.out.println();
        System.out.println("Количество элементов в массиве: " + mass.length);
        System.out.println("Сумма элементов в массиве: " + sum);
        System.out.println("Максимальный элемент в массиве: " + max);
        System.out.println("Минимальный элемент в массиве: " + min);
    }
}
