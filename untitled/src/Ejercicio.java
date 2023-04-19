/*Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
        aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
        en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí y utilizá
        una función llamada cualGana con dos parámetros con las jugadas de cada uno, que
        devuelve 0 en caso de empate, 1 si gana el primero, 2 si gana el segundo. El juego termina
        cuando el primero elije “*” como indicador de final.*/

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Judador 1: ");
        String nombre1 = scanner.nextLine();
        System.out.println("Jugador 2: ");
        String nombre2 = scanner.nextLine();

        int punt1 = 0;
        int punt2 = 0;
        String continuarPartida = " ";
        while (continuarPartida.equals("") == false) {
            System.out.println("Ingrese jugador 1 Piedra - Papel - Tijera - Spock");
            String eleccion1 = scanner.nextLine();
            System.out.println("Ingrese jugador 2 Piedra - Papel - Tijera - Spock");
            String eleccion2 = scanner.nextLine();

            int resultado = cualGana(eleccion1, eleccion2);
            if (resultado == 0) {
                System.out.println("Empate");
            } else if (resultado == 1) {
                System.out.println("Gano la ronda " + nombre1);
                punt1++;
            } else if (resultado == 2) {
                System.out.println("Gano la ronda " + nombre2);
                punt2++;
            }
            System.out.println("Ingrese si desea terminar con el juego u otro caracter si desea continuar: ");
            continuarPartida = scanner.nextLine();

        }

        if (punt1 == punt2) {
            System.out.println("Jugadores empatados");
        } else if (punt1 > punt2) {
            System.out.println(nombre1 + " ha ganado la partida");
        } else {
            System.out.println(nombre2 + " ha ganado la partida");
        }

    }

    public static int cualGana(String jugada1, String jugada2) {

        if (jugada1.toLowerCase().equals(jugada2.toLowerCase())) {
            return 0;
        } else if ((jugada1.toLowerCase().equals("piedra") && jugada2.toLowerCase().equals("tijera"))||
                (jugada1.toLowerCase().equals("papel") && jugada2.toLowerCase().equals("spock"))||
                (jugada1.toLowerCase().equals("spock") && jugada2.toLowerCase().equals("tijera"))||
                (jugada1.toLowerCase().equals("spock") && jugada2.toLowerCase().equals("piedra"))||
        (jugada1.toLowerCase().equals("papel") && jugada2.toLowerCase().equals("piedra"))||
        (jugada1.toLowerCase().equals("tijera") && jugada2.toLowerCase().equals("papel"))){
            return 1;
        } else{
            return 2;
        }
    }
}

//Modificá la función cualGana del Desafío 1 para jugar la variante Spock: Hay una
//posibilidad más, el señor Spock —formado por la mano Vulcana de Star Trek— tiene otros
//poderes según:
//Papel desaprueba Spock
//Spock destroza tijeras
//Spock vaporiza piedra

