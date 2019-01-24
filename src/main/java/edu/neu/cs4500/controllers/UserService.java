package edu.neu.cs4500.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;

@RestController
public class UserService {
    static List<User> users = new ArrayList();
    static  {
        users.add(new User(123, "alice", "alice", "Alive", "Wonderland"));
        users.add(new User(234, "bob", "bob", "Bob", "Marley"));
    }
    @GetMapping("/api/user")
    public List<User>findAllUsers() {
        return users;
    }
    @GetMapping("/api/user/{userId}")
    public User findUserByID(
            @PathVariable("userId") Integer id) {
            for (User user: users) {
                if(user.getId() == id)
                    return user;
            }
            return null;
    }
}
