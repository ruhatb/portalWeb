package workintech.Portal.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import workintech.Portal.entity.User;
import workintech.Portal.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public List<User> getlAll(){
        return userService.getAll();
    }

    @PostMapping("/user")
    public User save(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        //TODO id olmazsa bir exception olustur.
        return userService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        userService.remove(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User newUser) {
        return userService.update(id, newUser);
    }
}
