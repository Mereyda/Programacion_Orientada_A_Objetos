package practicaParcial;

import java.util.Date;

public abstract class Monopatin {
    protected Tecnico tecnico;
    protected Date ingresoReparacion;
    protected Date reparacionLimiteEstimada;
    protected Date inicioReal;
    protected Date reparacionFinalizada;
    protected boolean estaEnFuncionamiento;
    protected String status;

    public Monopatin(Tecnico tecnico, Date ingresoReparacion, Date reparacionLimiteEstimada, Date inicioReal, Date reparacionFinalizada, boolean estaEnFuncionamiento, String status) {
        this.tecnico = tecnico;
        this.ingresoReparacion = ingresoReparacion;
        this.reparacionLimiteEstimada = reparacionLimiteEstimada;
        this.inicioReal = inicioReal;
        this.reparacionFinalizada = reparacionFinalizada;
        this.estaEnFuncionamiento = estaEnFuncionamiento;
        this.status = status;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Date getIngresoReparacion() {
        return ingresoReparacion;
    }

    public void setIngresoReparacion(Date ingresoReparacion) {
        this.ingresoReparacion = ingresoReparacion;
    }

    public Date getReparacionLimiteEstimada() {
        return reparacionLimiteEstimada;
    }

    public void setReparacionLimiteEstimada(Date reparacionLimiteEstimada) {
        this.reparacionLimiteEstimada = reparacionLimiteEstimada;
    }

    public Date getInicioReal() {
        return inicioReal;
    }

    public void setInicioReal(Date inicioReal) {
        this.inicioReal = inicioReal;
    }

    public Date getReparacionFinalizada() {
        return reparacionFinalizada;
    }

    public void setReparacionFinalizada(Date reparacionFinalizada) {
        this.reparacionFinalizada = reparacionFinalizada;
    }

    public boolean isEstaEnFuncionamiento() {
        return estaEnFuncionamiento;
    }

    public void setEstaEnFuncionamiento(boolean estaEnFuncionamiento) {
        this.estaEnFuncionamiento = estaEnFuncionamiento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void estaReparado(){
        if(this.getReparacionLimiteEstimada().equals(this.getReparacionFinalizada())&& this.getStatus().equals("finalizado")){
            System.out.println( " su monopatin esta reparado por favor retiralo");

        } else{
            System.out.println( " el monopatin sige sin reparar");
        }
    }
}



