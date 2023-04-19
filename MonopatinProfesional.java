package acme;

import java.util.Date;

public class MonopatinProfesional extends Monopatin implements Comparable{
    private int cantidadReparaciones;
    private int numeroReparacionActual;
    private String tipoReparacion;

    public MonopatinProfesional(Tecnico tecnico, Date fechaInicioReparacion, Date fechaPlanificada, Date fechaInicioReparacionReal, Date fechaReparacionFinalizadaReal, String status, int cantidadReparaciones, int numeroReparacionActual, String tipoReparacion) {
        super(tecnico, fechaInicioReparacion, fechaPlanificada, fechaInicioReparacionReal, fechaReparacionFinalizadaReal, status);
        this.cantidadReparaciones = cantidadReparaciones;
        this.numeroReparacionActual = numeroReparacionActual;
        this.tipoReparacion = tipoReparacion;
    }

    public int getCantidadReparaciones() {
        return cantidadReparaciones;
    }

    public void setCantidadReparaciones(int cantidadReparaciones) {
        this.cantidadReparaciones = cantidadReparaciones;
    }

    public int getNumeroReparacionActual() {
        return numeroReparacionActual;
    }

    public void setNumeroReparacionActual(int numeroReparacionActual) {
        this.numeroReparacionActual = numeroReparacionActual;
    }

    public String getTipoReparacion() {
        return tipoReparacion;
    }

    public void setTipoReparacion(String tipoReparacion) {
        this.tipoReparacion = tipoReparacion;
    }

    @Override
    public String toString() {
        return "MonopatinProfesional{" +
                "cantidadReparaciones=" + cantidadReparaciones +
                ", numeroReparacionActual=" + numeroReparacionActual +
                ", tipoReparacion='" + tipoReparacion + '\'' +
                ", tecnico=" + tecnico.toString() +
                ", fechaInicioReparacion=" + fechaInicioReparacion +
                ", fechaPlanificada=" + fechaPlanificada +
                ", fechaInicioReparacionReal=" + fechaInicioReparacionReal +
                ", fechaReparacionFinalizadaReal=" + fechaReparacionFinalizadaReal +
                ", status='" + status + '\'' +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        MonopatinProfesional m2 = (MonopatinProfesional)o;
        return this.getCantidadReparaciones() - m2.getCantidadReparaciones();
    }
}
