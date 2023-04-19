package embarcacion;

import java.util.Date;

public abstract class Contrato {
    protected Persona persona;
    protected int mesesDuracion;
    protected Date fechaInicioActividad;
    protected boolean selladoMinisterioTrabajo;

    public Contrato(Persona persona, int mesesDuracion, Date fechaInicioActividad, boolean selladoMinisterioTrabajo) {
        this.persona = persona;
        this.mesesDuracion = mesesDuracion;
        this.fechaInicioActividad = fechaInicioActividad;
        this.selladoMinisterioTrabajo = selladoMinisterioTrabajo;
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

    public Date getFechaInicioActividad() {
        return fechaInicioActividad;
    }

    public void setFechaInicioActividad(Date fechaInicioActividad) {
        this.fechaInicioActividad = fechaInicioActividad;
    }

    public boolean isSelladoMinisterioTrabajo() {
        return selladoMinisterioTrabajo;
    }

    public void setSelladoMinisterioTrabajo(boolean selladoMinisterioTrabajo) {
        this.selladoMinisterioTrabajo = selladoMinisterioTrabajo;
    }
    public void incorporacionAlTrabajo(){
        if(this.isSelladoMinisterioTrabajo()){
            System.out.println("puede trabajar");
        }else{
            System.out.println("no puede ser incorporado");
        }
    }



}
