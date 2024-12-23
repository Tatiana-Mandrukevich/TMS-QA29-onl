/*Реализовать два наследника - ApplePhone и AndroidPhone -
эти классы должны переопределять абстрактный метод.*/

package lesson8;

public class ApplePhone extends Phone{

    @Override
    public boolean firmware(int version) {

        boolean isValid;

        if (version < 18) {
            System.out.println("Your phone needs to be updated.");
            isValid = false;
        }
        else if (version == 18) {
            System.out.println("The phone has the latest updates installed.");
            isValid = true;
        }
        else {
            System.out.println("The version is invalid.");
            isValid = false;
        }

        return isValid;
    }
}
