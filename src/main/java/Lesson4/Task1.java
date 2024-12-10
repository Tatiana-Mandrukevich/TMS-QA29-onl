package Lesson4;

public class Task1 {
    public static void run(String[] args) {
        int [] firstMass = {22, 5, 39, 8, 16, 99, 55, 83, 303}; // создан первый массив - 9 значений
        int [] secondMass = {88, 99, 25, 39, 101, 22, 6}; // создан второй массив - 7 значений
        System.out.print("Элементы, которые встречаются в двух массивах: ");
        for (int i = 0; i < firstMass.length; i++) { // прохождение по всем элементам первого массива
           for (int j = 0; j < secondMass.length; j++) { // прохождение по всем элементам второго массива
               if (firstMass[i] == secondMass[j]) { // сравнение элемента первого и второго массивов
                   System.out.print(firstMass[i] + ", ");
               }
           }
        }
    }
}
