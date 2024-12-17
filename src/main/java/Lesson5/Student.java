/*Необходимо создать класс Student со следующими полями:
1) Имя
2) Фамилия
3) Количество лет
4) Количество лекций, которые посещает студент:
В классе должны быть конструкторы
1) Принимающий имя и фамилию
2) Принимающий имя, фамилию и возраст
3) Принимающий все параметры
Так же в классе должны быть методы:
1) Метод, который возвращает полное имя и фамилию (имя + фамилия)
2) Метод, который не возвращает значение, но выводит сообщение <<фамилия посещает N занятий>>*/

package Lesson5;

public class Student {
    public String name;
    public String lastName;
    public int age;
    public int lectures;

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Student(String name, String lastName, int age) {
        this(name, lastName);
        this.age = age;
    }

    public Student(String name, String lastName, int age, int lectures) {
        this(name, lastName, age);
        this.lectures = lectures;
    }

    public String getFullName() {
        return name + " " + lastName;
    }

    public void printMessage() {
        System.out.println(lastName + " посещает " + lectures + " занятий");
    }
}
