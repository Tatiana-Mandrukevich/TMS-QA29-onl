/*В основном классе приложения создать 3 студентов, используя каждый из конструкторов.
На каждом объекте выполнить метод по получению полного имени, результат вывести в консоль.
На каждом объекте выполнить метод по печати, сколько занятий посещает студент.
Попробуйте любому студенту поменять количество занятий, которые он посещает.
Снова выведите информацию об этом студенте.*/

package lesson5;

public class NewStudents {
    public static void main(String[] args) {

        Student firstStudent = new Student("Anna", "Tarasova");
        String result = firstStudent.getFullName();
        System.out.println("Имя и фамилия студента: " + result);
        firstStudent.lectures = 10;
        firstStudent.printMessage();

        Student secondStudent = new Student("Mark", "Polyakov", 20);
        result = secondStudent.getFullName();
        System.out.println("Имя и фамилия студента: " + result);
        secondStudent.lectures = 12;
        secondStudent.printMessage();

        Student thirdStudent = new Student("Timofey", "Orlov", 22, 15);
        result = thirdStudent.getFullName();
        System.out.println("Имя и фамилия студента: " + result);
        thirdStudent.printMessage();
        System.out.println("Имя и фамилия студента: " + result);
        thirdStudent.lectures = 11;
        thirdStudent.printMessage();
    }
}
