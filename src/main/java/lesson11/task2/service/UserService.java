package lesson11.task2.service;

import lesson11.task2.User;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface UserService {

    public Set getUniqueNames(List<User> originalCollection);
    public Map getSortByAge (List<User> originalCollection);
}
