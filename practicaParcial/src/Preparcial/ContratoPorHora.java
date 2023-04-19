package Preparcial;

import java.util.Date;

public class ContratoPorHora extends Contrato implements Comparable {
    private int cantidadHorasXMes;
    private double valorHora;

    public ContratoPorHora(Persona persona, int mesesDuracion, Date fechaInicioActivacion, Date incorporacionTrabajo, boolean isMinisterioTrabajo, int cantidadHorasXMes, double valorHora) {
        super(persona, mesesDuracion, fechaInicioActivacion, incorporacionTrabajo, isMinisterioTrabajo);
        this.cantidadHorasXMes = cantidadHorasXMes;
        this.valorHora = valorHora;
    }

    public int getCantidadHorasXMes() {
        return cantidadHorasXMes;
    }

    public void setCantidadHorasXMes(int cantidadHorasXMes) {
        this.cantidadHorasXMes = cantidadHorasXMes;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public int compareTo(Object o) {
        ContratoPorHora comparacion = (ContratoPorHora) o;
        if (this.getCantidadHorasXMes() > comparacion.getCantidadHorasXMes()) {
            return 1;
        } else if (this.getCantidadHorasXMes() < comparacion.getCantidadHorasXMes()) {
            return -1;
        } else{
            return 0;
        }

    }
}


