/*Создать два экземпляра телефона - один ApplePhone и второй AndroidPhone.
Выполнить метод проверки для каждого из телефонов.
Выполнить проверку WindowsPhone телефона.

Создать абстрактный анонимный класс Phone прямо в коде приложения.
Проверить выполнения метода check с ним.
 */

package lesson8;

import lesson8.service.impl.RepairCheckerImpl;

public class MainApp {
    public static void main(String[] args) {
        Phone android = new AndroidPhone();
        RepairCheckerImpl repairChecker = new RepairCheckerImpl();
        repairChecker.setNumber("+375(33) 999-88-77");
        repairChecker.setVolumeLevel(VolumeLevel.HIGH);
        repairChecker.setVersion(14);
        boolean isValidAndroid = repairChecker.check(android);
        if (isValidAndroid) {
            System.out.println("The Android phone has been checked. Phone quality: high.");
        }
        else {
            System.out.println("The Android phone has been checked. Phone quality: low.");
        }

        System.out.println();

        Phone apple = new ApplePhone();
        repairChecker.setNumber("+375(33) 000-96-44");
        repairChecker.setVolumeLevel(VolumeLevel.LOW);
        repairChecker.setVersion(20);
        boolean isValidApple = repairChecker.check(android);
        if (isValidApple) {
            System.out.println("The Apple phone has been checked. Phone quality: high.");
        }
        else {
            System.out.println("The Apple phone has been checked. Phone quality: low.");
        }

        System.out.println();

        Phone windows = new ApplePhone();
        repairChecker.setNumber("+375(33) 976-88-21");
        repairChecker.setVolumeLevel(VolumeLevel.MEDIUM);
        repairChecker.setVersion(8);
        boolean isValidWindow = repairChecker.check(android);
        if (isValidWindow) {
            System.out.println("The Window phone has been checked. Phone quality: high.");
        }
        else {
            System.out.println("The Window phone has been checked. Phone quality: low.");
        }

        System.out.println();

        Phone phone = new Phone() {
            @Override
            public boolean firmware(int version) {
                return false;
            }
        };

        System.out.println("From anonymous class: " + phone.firmware(20));
    }
}
