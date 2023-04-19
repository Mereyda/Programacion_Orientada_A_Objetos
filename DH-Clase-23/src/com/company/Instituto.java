package com.company;

import java.util.ArrayList;

public class Instituto {
    private String nombre;
    private ArrayList<OfertaAcademica> ofertas = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(OfertaAcademica o){
        ofertas.add(o);
    }

    public void generarInforme(){
        for(OfertaAcademica oferta :ofertas)
            System.out.println(oferta.getNombre() + " precio:" + oferta.calcularPrecio());
    }
}
