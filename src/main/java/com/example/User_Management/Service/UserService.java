package com.example.User_Management.Service;

import com.example.User_Management.Entity.User;
import com.example.User_Management.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo){
        this.repo = repo;
    }

    public User createUser(User user){
        return repo.save(user);
    }

    public List<User> getAllUsers(){
        return repo.findAll();
    }

    public User getUserById(Integer id){
        return repo.findById(id).orElse(null);
    }

    public User updateUser(Integer id,User newUser){
    User old = repo.findById(id).orElse(null);

    if(old==null) return null;

    old.setName(newUser.getName());
    old.setEmail(newUser.getEmail());
    old.setCity(newUser.getCity());

    return repo.save(old);
    }

    public boolean deleteUser(Integer id){
        if(!repo.existsById(id)) return false;
        repo.deleteById(id);
        return true;
    }
}
