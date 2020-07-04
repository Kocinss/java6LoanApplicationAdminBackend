package java6lcredits.application.exception;

public class LoanApplicationNotFoundException extends RuntimeException {
    public LoanApplicationNotFoundException(String message){
        super(message);
    }
}
