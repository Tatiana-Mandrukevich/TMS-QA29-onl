/*Создать сервис для проверки качества ремонта телефонов.
В этом сервисе метод check - принимает телефон и проверяет, что он работоспособен,
Совершая тестовый звонок, включая музыку и проверяя версию прошивки телефона.*/

package lesson8.service.impl;

import lesson8.Phone;
import lesson8.VolumeLevel;
import lesson8.service.RepairChecker;

public class RepairCheckerImpl implements RepairChecker {

    String number;
    VolumeLevel volumeLevel;
    int version;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setVolumeLevel(VolumeLevel volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean check(Phone phone){
        boolean isValid = phone.call(number);

        if (!isValid) {
            return false;
        }

        isValid = phone.play(volumeLevel);
        if (!isValid) {
            return false;
        }

        return phone.firmware(version);
    }
}