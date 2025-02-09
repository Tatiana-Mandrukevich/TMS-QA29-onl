/*Создаем интерактивную игру - "Угадай или проиграй"
Необходимо создать сервис который будет выполнять 2 функции
1) метод validate - он будет принимать ставку пользователя и самого пользователя и проверять следующее:
1.1) что ставка меньше, чем сумма на счете пользователя
1.2) что ставка меньше чем максимально допустимая - 100 рублей
2) метод play - который будет сверять число вводимое пользователем с рандомно сгенерированным (в пределах от 0 до 5) и возвращать угадал пользователь или нет
2.1) метод должен проверить что пользователь ввел число от -1 до 5 или кинуть ошибку
2.2) если пользователь ввел -1 - программа должна понять, что пользователь покидает игру
2.3) метод должен вернуть boolean как результат угадывания ()
3) метод change - который будет принимать пользователя, ставку и результат угадывания и уменьшать или увеличивать баланс
Создаем класс User с двумя обязательными полями - имя и сумма на счету
Программа должна выполнить следующую логику
1) При запуске она предлагает ввести в терминал свое имя и сумму на счете, после это создается объект
User
2) В цикле пользователь будет поочередно вводить свою ставку и число, которое пытается угадать
3) Программа должна провалидировать (метод validate) ставку и в случае ошибки распечатать пользователю текст ошибки в терминал и предложить сделать другую ставку.
4) Если ставка корректная, то программа создает рандомное число и сравнивает его с числом, которое ввел пользователь (метод play).
5) Изменить баланс на счете в зависимости от результата угадывания
6) Если сумма на счете станет 0 - программа должна остановится - выведя в терминал сообщение.
7) Если сумма еще положительная - предложить пользователю сделать новую ставку*/

package lesson9;

import lesson9.service.HandlerService;
import lesson9.service.impl.HandlerServiceImpl;

public class MainApp {
    public static void main(String[] args) {

        HandlerService handlerService = new HandlerServiceImpl();

        handlerService.createUser();
        handlerService.acceptBetAndNumber();
        handlerService.getResult();
    }
}
