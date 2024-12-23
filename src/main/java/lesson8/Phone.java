/*Необходимо создать класс Phone.
В этом классе необходимо объявить три метода
1) call - принимает номер на который происходит звонок
2) play - принимает уровень громкости и воспроизводит музыку
3) firmware - метод, который проверяет версию прошивки телефона
Все методы имеют какую-то реализацию, кроме метода - firmware - он абстрактный*/

package lesson8;

public abstract class Phone {


    public boolean call(String number) {
        System.out.println("Call the number " + number);
        return true;
    }

    public boolean play(VolumeLevel volumeLevel) {
        System.out.println("Play music at " + volumeLevel + " volume.");
        return true;
    }

    public abstract boolean firmware(int version);
}
