package com.discountcalculator.demo.exception;

import java.util.List;

/**
 * @author Anuj Singh
 *
 */
public class ErrorResponse
{
    /**
     * @param message Set custom message for exception
     * @param details Detailed information for errors
     */
    public ErrorResponse(String message, List<String> details) {
        super();
        this.message = message;
        this.details = details;
    }
 
    //General error message about nature of error
    private String message;
 
    //Specific errors in API request processing
    private List<String> details;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    } 
}
