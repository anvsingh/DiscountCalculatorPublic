package com.discountcalculator.demo.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;



/**
 * @author Anuj Singh
 * This class is used to handle exception occurring due to http calls
 *
 */
@SuppressWarnings({"unchecked","rawtypes"})
@ControllerAdvice
public class CustomExceptionHandler
{   
	  @ExceptionHandler(ServletRequestBindingException.class) public final
	  ResponseEntity<Object> handleHeaderException(Exception ex, WebRequest
	  request) { List<String> details = new ArrayList<>();
	  details.add(ex.getLocalizedMessage()); ErrorResponse error = new
	  ErrorResponse("Bad Request", details); return new ResponseEntity(error,
	  HttpStatus.BAD_REQUEST); }
	 
    
    /**
     * @param ex
     * @param request
     * @return Server Error i.e. Exception
     */
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) 
    {
        List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        ErrorResponse error = new ErrorResponse("Server Error", details);
        return new ResponseEntity(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
