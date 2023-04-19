package Clase18S;

public class Main {
    public static void main(String[] args) {
        Seleccion s1 = new Seleccion("Argentina", "delantero");
        s1.agregarJugador(new Jugador("Pablo", "medio campo",11));
        s1.agregarJugador(new Jugador("defensa","Garcia",15));
        s1.agregarJugador(new Jugador("arquero","martinez",9));
        s1.obtenerPlantel();
        s1.cantJugadores("DELANTERO");


    }
}
