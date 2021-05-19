package unibe.edu.ec.api.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unibe.edu.ec.api.controller.UserController;
import unibe.edu.ec.api.dtos.UserDto;
import unibe.edu.ec.api.resource.exceptions.UserCreateException;

@RestController
@RequestMapping(UserResource.USER)
public class UserResource {

    public static final String USER = "/user";

    private UserController userController;

    @Autowired
    public UserResource(UserController userController) {
        this.userController = userController;
    }

    @PostMapping
    public ResponseEntity createUser(@RequestBody UserDto userDto) throws UserCreateException {
        try {
            this.userController.createUser(userDto);
            return new ResponseEntity("\"El usuario fue creado\"", HttpStatus.ACCEPTED);
        } catch (Exception e) {
            throw new UserCreateException("la información enviada no es valida");
        }

    }
}
