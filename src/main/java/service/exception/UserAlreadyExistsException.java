package service.exception;

/**
 * Created by Janusz on 2016-01-08.
 */
public class UserAlreadyExistsException extends RuntimeException {

    public UserAlreadyExistsException(final String message) {
        super(message);
    }

}