package com.company;

public class Taller extends OfertaAcademica{
    private int cantTrabajosPracticos;
    private double precioTrabajoPractico;

    public int getCantTrabajosPracticos() {
        return cantTrabajosPracticos;
    }

    public void setCantTrabajosPracticos(int cantTrabajosPracticos) {
        this.cantTrabajosPracticos = cantTrabajosPracticos;
    }

    public double getPrecioTrabajoPractico() {
        return precioTrabajoPractico;
    }

    public void setPrecioTrabajoPractico(double precioTrabajoPractico) {
        this.precioTrabajoPractico = precioTrabajoPractico;
    }

    @Override
    public double calcularPrecio() {
        return cantTrabajosPracticos * precioTrabajoPractico;
    }
}