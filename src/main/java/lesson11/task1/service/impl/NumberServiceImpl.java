package lesson11.task1.service.impl;

import lesson11.task1.service.NumberService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberServiceImpl implements NumberService {

    @Override
    public Map<Integer, Integer> getUniqueNumbersRepeats(List<Integer> originalCollection) {

        Map<Integer, Integer> finishCollection = new HashMap<>();

        Integer value;

        for (Integer number : originalCollection) {

            if (finishCollection.containsKey(number)) {
                value = finishCollection.get(number);
                finishCollection.put(number, ++value);
            }

            else {
                finishCollection.put(number, 1);
            }
        }

        return finishCollection;
    }
}
