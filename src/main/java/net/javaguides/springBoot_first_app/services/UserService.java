package net.javaguides.springBoot_first_app.services;

import net.javaguides.springBoot_first_app.api.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private List<User> userList;

    public UserService(List<User> userList) {
        this.userList = userList;
        User user1 = new User(1, "Idea", 32, "ishu@gmail.com");
        User user2 = new User(2, "Alex", 28, "alex@gmail.com");
        User user3 = new User(3, "Sophia", 25, "sophia@gmail.com");
        User user4 = new User(4, "Michael", 30, "michael@gmail.com");
        User user5 = new User(5, "Emma", 27, "emma@gmail.com");
        User user6 = new User(6, "Daniel", 35, "daniel@gmail.com");
        User user7 = new User(7, "Olivia", 29, "olivia@gmail.com");
        User user8 = new User(8, "Ethan", 31, "ethan@gmail.com");
        User user9 = new User(9, "Ava", 26, "ava@gmail.com");
        User user10 = new User(10, "William", 34, "william@gmail.com");
        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5,user6,user7,user8,user9,user10));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional =Optional.empty();
        for(User user : userList) {
            if(id==user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
