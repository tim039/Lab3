package pokerExceptions;

public class ShortHandException extends Exception {
	public ShortHandException () {

    }

    public ShortHandException (String message) {
        super (message);
    }

    public ShortHandException (Throwable cause) {
        super (cause);
    }

    public ShortHandException (String message, Throwable cause) {
        super (message, cause);
    }
}
