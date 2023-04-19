package com.company;

import java.util.ArrayList;

public class ProgramaIntensivo extends OfertaAcademica{

    private double porcentajeBonifiacion;
    private ArrayList<OfertaAcademica> ofertasAcademicas = new ArrayList<>();

    public double getPorcentajeBonifiacion() {
        return porcentajeBonifiacion;
    }

    public void setPorcentajeBonifiacion(double porcentajeBonifiacion) {
        this.porcentajeBonifiacion = porcentajeBonifiacion;
    }

    public void agregar(OfertaAcademica oferta)
    {
        ofertasAcademicas.add(oferta);
    }


    @Override
    public double calcularPrecio() {
        double total = 0;

        for(OfertaAcademica oferta: ofertasAcademicas)
            total += oferta.calcularPrecio();

        double descuento = total * porcentajeBonifiacion / 100;

        return total - descuento;
    }
}
