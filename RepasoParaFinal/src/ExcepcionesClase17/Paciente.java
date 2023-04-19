package ExcepcionesClase17;

import javax.annotation.processing.FilerException;
import java.util.Date;

public class Paciente {
    private String nombre;
    private String apellido;
    private int dni;
    private String historiaClinica;
    private Date fechaInternacion;
    private Date fechaAlta;

    public Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws FilerException, FechaException {
        Date hoy = new Date();
        this.nombre = nombre;
        this.apellido = apellido;
        fechaAlta = null;
        if (fechaInternacion.before(hoy)) {
            this.fechaInternacion = fechaInternacion;
        } else {
            throw new FechaException("fecha no valida");
        }
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws FilerException {
        if (fechaAlta.after(fechaInternacion)) {
            System.out.println("ok");
        } else {
            throw new FilerException("ingresa una fecha posterior a la internacion");

        }
    }
}
