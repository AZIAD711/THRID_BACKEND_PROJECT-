package com.example.demo.contoller;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("add/users")
    public UserDto addUser(@RequestBody UserDto userDto){
        return userService.add(userDto);
    }
    @GetMapping("get/users")
    public List<UserEntity> findAll(){
        return userService.findAll();
    }

}
