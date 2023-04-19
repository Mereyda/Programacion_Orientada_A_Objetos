package Preparcial;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Contrato luca = new ContratoPorHora(new Persona("luca","perez", 94124722, 25),5, new Date(122, 8, 15),new Date(122, 8, 25), true, 9, 250.0);
        Contrato kike = new ContratoPorHora(new Persona("kike","griton", 94124722, 25),5, new Date(122, 8, 15),new Date(122, 8, 25), true, 9, 250.0);

        System.out.println(((ContratoPorHora)luca).compareTo(kike)); // casteo

       kike.incorporacionAlTrabajo();

    }



   }

