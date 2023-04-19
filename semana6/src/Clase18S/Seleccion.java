package Clase18S;

import java.util.ArrayList;

public class Seleccion {
    private ArrayList<Jugador> plantel;
    private String nombre;


    public Seleccion(ArrayList<Jugador> plantel, String nombre) {
        this.plantel = plantel;
        this.nombre = nombre;
    }

    public void setPlantel(ArrayList<Jugador> plantel) {
        this.plantel = plantel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public ArrayList<Jugador> getPlantel() {

        return plantel;
    }

    public ArrayList<Jugador> obtenerPlantel() {
        ArrayList<Jugador> reservas = new ArrayList<Jugador>();
        for (int i = 18; i <= this.plantel.size(); i++) {
            reservas.add(plantel.get(1));
        }
        return reservas;
    }

    public void agregarJugador(Jugador plantel){
        this.plantel.add(plantel);
    }

    public int cantJugadores(String posicionDeseada){
        int contador = 0;
        if(posicionDeseada.equals("arquero") || posicionDeseada.equals("defensor")|| posicionDeseada.equals("mediocampo")|| posicionDeseada.equals("delantero")){
            for( int i=0; i<= this.plantel.size() -1; i++){
                if(this.plantel.get(i).getPosicion().equals(posicionDeseada));
                contador++;

            }
        }
        return contador;
    }

}

