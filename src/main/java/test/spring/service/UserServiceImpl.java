package test.spring.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Service;
import test.spring.entity.User;

import java.util.List;

@Service
public class UserServiceImpl extends ForseService implements UserService{
    String getType() {
        return "User";
    }

    public List<User> getAll() {
        return getForceApi().queryAll("select Id, Username, LastName, FirstName, Name, CompanyName, Division, Department, Title, Street, City, State, PostalCode, Country from User", User.class).getRecords();
    }


}
