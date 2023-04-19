package Clase18s;

import java.util.ArrayList;
import java.util.List;

public class Recorrido {
    private static ArrayList estaciones = new ArrayList<>(List.of("Buenos Aires","Lujan","Mercedes","Suipacha","Chivilcoy","Alberti","Bragado"));
    private String destinoFinal;
    private String destinoInicial;

    public Recorrido(String destinoFinal, String destinoInicial) throws ExcepcionRecorrido{
        if (estaciones.contains(destinoFinal)&& estaciones.contains(destinoInicial)){
            this.destinoFinal = destinoFinal;
            this.destinoInicial = destinoInicial;
        } else{
            throw new ExcepcionRecorrido("estaciones invalidas");
        }
    }

    public static ArrayList getEstaciones() {
        return estaciones;
    }

    public static void setEstaciones(ArrayList estaciones) {
        Recorrido.estaciones = estaciones;
    }

    public String getDestinoFinal() {
        return destinoFinal;
    }

    public void setDestinoFinal(String destinoFinal) {
        this.destinoFinal = destinoFinal;
    }

    public String getDestinoInicial() {
        return destinoInicial;
    }

    public void setDestinoInicial(String destinoInicial) {
        this.destinoInicial = destinoInicial;
    }
    public void agregarEstacion(String estacion, int posicion){
        getEstaciones().add(posicion -1, estacion);
    }

    @Override
    public String toString() {
        return "Recorrido{" +
                "destinoFinal='" + destinoFinal + '\'' +
                ", destinoInicial='" + destinoInicial + '\'' +
                '}';
    }
}
