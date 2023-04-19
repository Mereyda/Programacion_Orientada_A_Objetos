package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws FechaException {
        try {
            Paciente paciente=new Paciente("Juan","Perez","12345",new Date(122,9,1));
            paciente.darAlta(new Date(122, 5,  3));

        } catch (FechaException e){
            System.out.println( e.getMessage());

        }



    }
}
