package app.boot.exception;

public class ApplicationNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -336215399839698643L;

    public ApplicationNotFoundException(String exception) {
        super(exception);
    }
}
