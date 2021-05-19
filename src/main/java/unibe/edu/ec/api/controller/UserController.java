package unibe.edu.ec.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import unibe.edu.ec.api.documents.User;
import unibe.edu.ec.api.dtos.UserDto;
import unibe.edu.ec.api.repositories.UserRepository;

@Controller
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setLasName(userDto.getLastName());
        user.setRole(userDto.getRole());
        this.userRepository.save(user);
    }
}
