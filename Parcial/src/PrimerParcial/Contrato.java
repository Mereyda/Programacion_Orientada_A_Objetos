package PrimerParcial;

import java.util.Date;

public abstract class Contrato {
    protected Persona persona;
    protected int mesDeDuracion;
    protected Date inicioActividades;
    protected boolean selladoMinisterio;

    public Contrato(Persona persona, int mesDeDuracion, Date inicioActividades, boolean selladoMinisterio) {
        this.persona = persona;
        this.mesDeDuracion = mesDeDuracion;
        this.inicioActividades = inicioActividades;
        this.selladoMinisterio = selladoMinisterio;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getMesDeDuracion() {
        return mesDeDuracion;
    }

    public void setMesDeDuracion(int mesDeDuracion) {
        this.mesDeDuracion = mesDeDuracion;
    }

    public Date getInicioActividades() {
        return inicioActividades;
    }

    public void setInicioActividades(Date inicioActividades) {
        this.inicioActividades = inicioActividades;
    }

    public boolean isSelladoMinisterio() {
        return selladoMinisterio;
    }

    public void setSelladoMinisterio(boolean selladoMinisterio) {
        this.selladoMinisterio = selladoMinisterio;
    }
    public boolean puedeTrabajar(){
        if(isSelladoMinisterio() == true){
            System.out.println(getPersona().getNombre() + " esta habilitade para trabajar");
            return true;
        }
        else{
            System.out.println(getPersona().getNombre() + " no esta habilitade para trabajar");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "persona=" + persona +
                ", mesDeDuracion=" + mesDeDuracion +
                ", inicioActividades=" + inicioActividades +
                ", selladoMinisterio=" + selladoMinisterio +
                '}';
    }
}
