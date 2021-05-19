package unibe.edu.ec.api.resource.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class UserCreateException extends Exception{

    private static final long serialVersionUID= -7717691994704695707L;

    public UserCreateException(String message) {
        super(message);
    }
}
