package mang.church.core.exception;

public class ClientAlreadyExistsException extends RuntimeException{
    public ClientAlreadyExistsException(String message){
        super(message);
    }
}
