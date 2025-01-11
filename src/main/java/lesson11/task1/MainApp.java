/*Есть список, содержащий цифры, которые повторяются.
Необходимо вывести все цифры (без дубликатов) и сколько они повторяются в списке.*/

package lesson11.task1;

import lesson11.task1.service.NumberService;
import lesson11.task1.service.impl.NumberServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        List<Integer> originalCollection = new ArrayList<Integer>();

        originalCollection.add(10);
        originalCollection.add(90);
        originalCollection.add(44);
        originalCollection.add(20);
        originalCollection.add(31);
        originalCollection.add(18);
        originalCollection.add(44);
        originalCollection.add(10);
        originalCollection.add(22);
        originalCollection.add(18);
        originalCollection.add(31);
        originalCollection.add(10);
        originalCollection.add(31);

        System.out.println("Original collection: " + originalCollection);

        NumberService numbersService = new NumberServiceImpl();

        System.out.println("Final collection (unique number = repeat in list)" + numbersService.getUniqueNumbers(originalCollection));

    }
}
