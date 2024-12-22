/*Создать сервис для проверки качества ремонта телефонов.
В этом сервисе метод check - принимает телефон и проверяет, что он работоспособен,
Совершая тестовый звонок, включая музыку и проверяя версию прошивки телефона.*/

package lesson8.service;

import lesson8.Phone;

public interface RepairChecker {
    public boolean check(Phone phone);
}