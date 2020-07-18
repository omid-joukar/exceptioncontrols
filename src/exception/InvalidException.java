package exception;

/**
 * Created by KPS on 7/18/2020.
 */
public class InvalidException extends Exception {
    public InvalidException() {
    }

    public InvalidException(String message) {
        super(message);
    }

    public InvalidException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidException(Throwable cause) {
        super(cause);
    }
}
