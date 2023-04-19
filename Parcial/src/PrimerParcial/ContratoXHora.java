package PrimerParcial;

import java.util.Date;

public class ContratoXHora extends Contrato implements Comparable{
    private double cantidadHorasMensual;
    private double valorHora;

    public ContratoXHora(Persona persona, int mesDeDuracion, Date inicioActividades, boolean selladoMinisterio, double cantidadHorasMensual, double valorHora) {
        super(persona, mesDeDuracion, inicioActividades, selladoMinisterio);
        this.cantidadHorasMensual = cantidadHorasMensual;
        this.valorHora = valorHora;
    }

    public double getCantidadHorasMensual() {
        return cantidadHorasMensual;
    }

    public void setCantidadHorasMensual(double cantidadHorasMensual) {
        this.cantidadHorasMensual = cantidadHorasMensual;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public int compareTo(Object o) {
        ContratoXHora compcontrato = (ContratoXHora) o;
        int resul = 0;
        if(this.getCantidadHorasMensual() > compcontrato.getCantidadHorasMensual())
            return 1;
        if(this.getCantidadHorasMensual() < compcontrato.getCantidadHorasMensual())
            return -1;
        else
            return resul;
    }
}
