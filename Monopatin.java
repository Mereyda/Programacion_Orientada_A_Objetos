package acme;

import java.util.Date;

public abstract class Monopatin {
    protected Tecnico tecnico;
    protected Date fechaInicioReparacion;
    protected Date fechaPlanificada;
    protected Date fechaInicioReparacionReal;
    protected Date fechaReparacionFinalizadaReal;
    protected String status;


    public Monopatin(Tecnico tecnico, Date fechaInicioReparacion, Date fechaPlanificada, Date fechaInicioReparacionReal, Date fechaReparacionFinalizadaReal, String status) {
        this.tecnico = tecnico;
        this.fechaInicioReparacion = fechaInicioReparacion;
        this.fechaPlanificada = fechaPlanificada;
        this.fechaInicioReparacionReal = fechaInicioReparacionReal;
        this.fechaReparacionFinalizadaReal = fechaReparacionFinalizadaReal;
        this.status = status;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Date getFechaInicioReparacion() {
        return fechaInicioReparacion;
    }

    public void setFechaInicioReparacion(Date fechaInicioReparacion) {
        this.fechaInicioReparacion = fechaInicioReparacion;
    }

    public Date getFechaPlanificada() {
        return fechaPlanificada;
    }

    public void setFechaPlanificada(Date fechaPlanificada) {
        this.fechaPlanificada = fechaPlanificada;
    }

    public Date getFechaInicioReparacionReal() {
        return fechaInicioReparacionReal;
    }

    public void setFechaInicioReparacionReal(Date fechaInicioReparacionReal) {
        this.fechaInicioReparacionReal = fechaInicioReparacionReal;
    }

    public Date getFechaReparacionFinalizadaReal() {
        return fechaReparacionFinalizadaReal;
    }

    public void setFechaReparacionFinalizadaReal(Date fechaReparacionFinalizadaReal) {
        this.fechaReparacionFinalizadaReal = fechaReparacionFinalizadaReal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void estaReparado(){
        if(this.getFechaPlanificada().equals(this.getFechaReparacionFinalizadaReal()) && this.getStatus().equals("Finalizado")){
            System.out.println("Su monopatin esta reparado, por favor retirelo");
        }else{
            System.out.println("El monopatin sigue hecho percha");
        }
    }
}
