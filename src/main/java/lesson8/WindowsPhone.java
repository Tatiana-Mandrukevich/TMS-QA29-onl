//Создать еще одного наследника Phone - WindowsPhone. В данном классе переопределись метод саll.

package lesson8;

public class WindowsPhone extends Phone{

    @Override
    public boolean firmware(int version) {

        boolean isValid;

        if (version < 8) {
            System.out.println("Your phone needs to be updated.");
            isValid = false;
        }
        else if (version == 8) {
            System.out.println("The phone has the latest updates installed.");
            isValid = true;
        }
        else {
            System.out.println("The version is invalid.");
            isValid = false;
        }

        return isValid;
    }

    @Override
    public boolean call(String number) {
        System.out.println("Calling the number " + number + " does not work.");
        return false;
    }
}
