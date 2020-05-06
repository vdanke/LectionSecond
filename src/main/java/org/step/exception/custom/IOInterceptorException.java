package org.step.exception.custom;

public class IOInterceptorException extends Exception {

    public IOInterceptorException(String message) {
        super(message);
    }

    public IOInterceptorException(Throwable cause) {
        super(cause);
    }
}
