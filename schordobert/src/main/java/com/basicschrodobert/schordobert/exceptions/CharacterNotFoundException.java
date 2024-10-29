package com.basicschrodobert.schordobert.exceptions;

public class CharacterNotFoundException extends RuntimeException{
    public CharacterNotFoundException(long id)
    { super("Could not find the Character with the id " + id);}
}
