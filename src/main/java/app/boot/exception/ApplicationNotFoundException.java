package app.boot.exception;

public class ApplicationNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -4112549479329680904L;

    public ApplicationNotFoundException(String message, Long invalidApplicationId) {
        super(message);

    }

}
