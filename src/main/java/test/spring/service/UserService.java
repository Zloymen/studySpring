package test.spring.service;

import test.spring.entity.User;

import java.util.List;

public interface UserService extends IForseService{
    List<User> getAll();
}
