package io.pragra.learning.nov15;

public class InsufficientStockException extends RuntimeException {
    public InsufficientStockException(String thisBookIsNotAvailable) {
        super(thisBookIsNotAvailable);
    }
}
