package Preparcial;

import java.util.Date;

public abstract class Contrato {
    protected Persona persona;
    protected int mesesDuracion;
    protected Date fechaInicioActivacion;
    protected Date incorporacionTrabajo;
    protected boolean isMinisterioTrabajo;

    public Contrato(Persona persona, int mesesDuracion, Date fechaInicioActivacion, Date incorporacionTrabajo, boolean isMinisterioTrabajo) {
        this.persona = persona;
        this.mesesDuracion = mesesDuracion;
        this.fechaInicioActivacion = fechaInicioActivacion;
        this.incorporacionTrabajo = incorporacionTrabajo;
        this.isMinisterioTrabajo = isMinisterioTrabajo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getMesesDuracion() {
        return mesesDuracion;
    }

    public void setMesesDuracion(int mesesDuracion) {
        this.mesesDuracion = mesesDuracion;
    }

    public Date getFechaInicioActivacion() {
        return fechaInicioActivacion;
    }

    public void setFechaInicioActivacion(Date fechaInicioActivacion) {
        this.fechaInicioActivacion = fechaInicioActivacion;
    }

    public Date getIncorporacionTrabajo() {
        return incorporacionTrabajo;
    }

    public void setIncorporacionTrabajo(Date incorporacionTrabajo) {
        this.incorporacionTrabajo = incorporacionTrabajo;
    }
    public void incorporacionAlTrabajo(){
        if(this.isMinisterioTrabajo){
            System.out.println( " puede trabajar");
        } else{
            System.out.println( " no puede trabajar");
        }
    }
}
