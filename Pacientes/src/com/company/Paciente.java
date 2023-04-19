package com.company;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;
    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws FechaException {   Date hoy= new Date();
        this.nombre=nombre;
        this.apellido=apellido;
        fechaAlta=null;
        if (fechaInternacion.before(hoy))
            this.fechaInternacion=fechaInternacion;
        else{
            throw new FechaException(" el dia de internacion no puede ser posterior");
        }
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws FechaException {
        if (fechaAlta.after(fechaInternacion))
            System.out.println("Ok");
        else
            System.out.println(" no se puede");
            throw new FechaException(" la fecha de alta no puede ser posterior al dia de la internacion");
    }



}
