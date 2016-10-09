package pokerExceptions;

public class DeckException extends Exception{
	
	public DeckException () {

    }

    public DeckException (String message) {
        super (message);
    }

    public DeckException (Throwable cause) {
        super (cause);
    }

    public DeckException (String message, Throwable cause) {
        super (message, cause);
    }
}
