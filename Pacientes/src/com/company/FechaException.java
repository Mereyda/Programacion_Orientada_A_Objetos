package com.company;

public class FechaException extends Exception{
    public FechaException(String message) {
        super(message);
    }


    @Override
    public String toString() {
        return "Se produjo una EXCEPCION en .." + this.getClass().getName() + " " + getClass();
    }

}
