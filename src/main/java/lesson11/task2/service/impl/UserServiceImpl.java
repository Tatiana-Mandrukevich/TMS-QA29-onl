package lesson11.task2.service.impl;

import lesson11.task2.User;
import lesson11.task2.service.UserService;

import java.util.*;

public class UserServiceImpl implements UserService {

    @Override
    public Set<String> getUniqueNames(List<User> originalCollection) {

        Set<String> collectionByUniqueName = new HashSet<>();

        for (User user : originalCollection) {
            collectionByUniqueName.add(user.getName());
        }

        return collectionByUniqueName;
    }

    @Override
    public Set<User> getSortByAge(List<User> originalCollection) {

        Set<User> collectionByAge = new TreeSet<>();

        collectionByAge.addAll(originalCollection);

        return collectionByAge;
    }
}
