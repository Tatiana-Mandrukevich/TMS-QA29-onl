package Lesson4;

public class Task1 {
    public static void main(String[] args) {
        int [] FirstMass = {22, 5, 39, 8, 16, 99, 55, 83, 303}; // создан первый массив - 9 значений
        int [] SecondMass = {88, 99, 25, 39, 101, 22, 6}; // создан второй массив - 7 значений
        System.out.print("Элементы, которые встречаются в двух массивах: ");
        for (int i = 0; i < FirstMass.length; i++) { // прохождение по всем элементам первого массива
           for (int j = 0; j < SecondMass.length; j++) { // прохождение по всем элементам второго массива
               if (FirstMass[i] == SecondMass[j]) { // сравнение элемента первого и второго массивов
                   System.out.print(FirstMass[i] + ", ");
               }
           }
        }
    }
}
