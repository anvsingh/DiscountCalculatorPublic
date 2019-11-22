package com.discountcalculator.demo.exception;

public class MissingHeaderException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    /**
     * @param exception  It is used to handle Missing Header Exception
     * 
     */
    public MissingHeaderException(String exception) {
        super(exception);
    }
}
