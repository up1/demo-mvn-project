package feature01.controller;

import feature01.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("feature01")
public class Feature01Controller {

    @RequestMapping(value = "/flow01/{userId}", method = GET)
    public List<User> firstFlow(@PathVariable Long userId) {
        List<User>  users = new ArrayList<User>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        return users;
    }


}
