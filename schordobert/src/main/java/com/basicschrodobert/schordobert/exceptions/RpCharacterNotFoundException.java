package com.basicschrodobert.schordobert.exceptions;

public class RpCharacterNotFoundException extends RuntimeException{
    public RpCharacterNotFoundException(long id)
    { super("Could not find the Character with the id " + id);}
}
