package practicaParcial;

import java.util.Date;

public class MonopatinProfesional extends Monopatin implements Comparable {
    private String cantidadReparacion;
    private int numeroReparacionActual;
    private String reparacion;

    public MonopatinProfesional(Tecnico tecnico, Date ingresoReparacion, Date reparacionLimiteEstimada, Date inicioReal, Date reparacionFinalizada, boolean estaEnFuncionamiento, String status, String cantidadReparacion, int numeroReparacionActual, String reparacion) {
        super(tecnico, ingresoReparacion, reparacionLimiteEstimada, inicioReal, reparacionFinalizada, estaEnFuncionamiento, status);
        this.cantidadReparacion = cantidadReparacion;
        this.numeroReparacionActual = numeroReparacionActual;
        this.reparacion = reparacion;
    }

    public MonopatinProfesional(Tecnico tecnico, Date ingresoReparacion, Date reparacionLimiteEstimada, Date inicioReal, Date reparacionFinalizada, boolean estaEnFuncionamiento, String status, String cantidadReparacion) {
        super(tecnico, ingresoReparacion, reparacionLimiteEstimada, inicioReal, reparacionFinalizada, estaEnFuncionamiento, status);
        this.cantidadReparacion = cantidadReparacion;
    }


    public String getCantidadReparacion() {
        return cantidadReparacion;
    }

    public void setCantidadReparacion(String cantidadReparacion) {
        this.cantidadReparacion = cantidadReparacion;
    }

    public int getNumeroReparacionActual() {
        return numeroReparacionActual;
    }

    public void setNumeroReparacionActual(int numeroReparacionActual) {
        this.numeroReparacionActual = numeroReparacionActual;
    }

    public String getReparacion() {
        return reparacion;
    }

    public void setReparacion(String reparacion) {
        this.reparacion = reparacion;
    }

    @Override
    public String toString() {
        return "MonopatinProfesional{" +
                "reparacion='" + reparacion + '\'' +
                ", tecnico=" + tecnico +
                ", ingresoReparacion=" + ingresoReparacion +
                ", reparacionLimiteEstimada=" + reparacionLimiteEstimada +
                ", inicioReal=" + inicioReal +
                ", reparacionFinalizada=" + reparacionFinalizada +
                ", estaEnFuncionamiento=" + estaEnFuncionamiento +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

//    @Override
//    public int compareTo(Object o) {
//        MonopatinProfesional m2 = (MonopatinProfesional) o;
//        return this.getCantidadReparacion() - m2.getCantidadReparacion();
//    }



}
