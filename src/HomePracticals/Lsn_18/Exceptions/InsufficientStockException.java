package HomePracticals.Lsn_18.Exceptions;

public class InsufficientStockException extends RuntimeException{
    public InsufficientStockException (String message) {
        super(message);
    }
}
