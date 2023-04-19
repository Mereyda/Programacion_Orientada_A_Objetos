package com.company;
import java.util.ArrayList;

public class Carrera extends OfertaAcademica {

    private ArrayList<OfertaAcademica> ofertasAcademicas = new ArrayList<>();
    private double precioBase = 0;

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void agregar(OfertaAcademica oferta) throws Exception {
        if (oferta instanceof Curso){
            if(((Curso) oferta).getCargaHoraria() < 10) {
                throw new Exception("No se permite el ingreso de materias con menos de 10 horas");
            }
        }
        ofertasAcademicas.add(oferta);
    }

    @Override
    public double calcularPrecio() {
        double total = 0;

        for(OfertaAcademica oferta: ofertasAcademicas)
            total += oferta.calcularPrecio();

        return total + precioBase;
    }


}
