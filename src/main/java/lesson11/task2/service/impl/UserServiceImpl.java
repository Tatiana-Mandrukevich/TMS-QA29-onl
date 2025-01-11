package lesson11.task2.service.impl;

import lesson11.task2.User;
import lesson11.task2.service.UserService;

import java.util.*;

public class UserServiceImpl implements UserService {

    @Override
    public Set getUniqueNames(List<User> originalCollection) {

        Set<String> collectionByUniqueName = new TreeSet<>();

        for (User user : originalCollection) {
            collectionByUniqueName.add(user.getName());
        }

        return collectionByUniqueName;
    }

    @Override
    public Map getSortByAge(List<User> originalCollection) {

        Map collectionByAge = new TreeMap<>();

        for (User user : originalCollection) {
            collectionByAge.put(user.getAge(), user.getName());
        }

        return collectionByAge;
    }
}
