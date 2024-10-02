package com.moacyr_soares.customer_CRUD_challenge.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message){

        super(message);
    }
}
