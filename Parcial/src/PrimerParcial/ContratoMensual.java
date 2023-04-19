package PrimerParcial;

import java.util.Date;

public class ContratoMensual extends Contrato{
    private double salarioMensual;
    private int horasTotales;
    private String cargo;

    public ContratoMensual(Persona persona, int mesDeDuracion, Date inicioActividades, boolean selladoMinisterio, double salarioMensual, int horasTotales, String cargo) {
        super(persona, mesDeDuracion, inicioActividades, selladoMinisterio);
        this.salarioMensual = salarioMensual;
        this.horasTotales = horasTotales;
        this.cargo = cargo;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public int getHorasTotales() {
        return horasTotales;
    }

    public void setHorasTotales(int horasTotales) {
        this.horasTotales = horasTotales;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void esJefe(){
        if(this.getCargo().equals("jefe"))
            System.out.println("Soy Jefe");
        else
            System.out.println("No soy Jefe");
    }

    @Override
    public String toString() {
        return "ContratoMensual{" +
                "salarioMensual=" + salarioMensual +
                ", horasTotales=" + horasTotales +
                ", cargo='" + cargo + '\'' +
                ", persona=" + persona +
                ", mesDeDuracion=" + mesDeDuracion +
                ", inicioActividades=" + inicioActividades +
                ", selladoMinisterio=" + selladoMinisterio +
                '}';
    }
}
