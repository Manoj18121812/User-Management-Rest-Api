package com.example.User_Management.Controller;

import com.example.User_Management.Entity.User;
import com.example.User_Management.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service){
        this.service = service;
    }

    @PostMapping
    public User create(@RequestBody User user){
        return service.createUser(user);
    }

    @GetMapping
    public List<User> getAll(){
    return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Integer id){
    return service.getUserById(id);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Integer id ,@RequestBody User user){
    return service.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        boolean deleted = service.deleteUser(id);
        return deleted ? "User Deleted" : "User Not Found";
    }
}
