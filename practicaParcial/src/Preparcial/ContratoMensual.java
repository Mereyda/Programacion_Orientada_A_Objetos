package Preparcial;

import java.util.Date;

public class ContratoMensual extends Contrato{
    private double salarioMensual;
    private int horasTotales;
    private String cargo;

    public ContratoMensual(Persona persona, int mesesDuracion, Date fechaInicioActivacion, Date incorporacionTrabajo, boolean isMinisterioTrabajo, double salarioMensual, int horasTotales, String cargo) {
        super(persona, mesesDuracion, fechaInicioActivacion, incorporacionTrabajo, isMinisterioTrabajo);
        this.salarioMensual = salarioMensual;
        this.horasTotales = horasTotales;
        this.cargo = cargo;
    }

    public ContratoMensual(Persona persona, int mesesDuracion, Date fechaInicioActivacion, Date incorporacionTrabajo, boolean isMinisterioTrabajo) {
        super(persona, mesesDuracion, fechaInicioActivacion, incorporacionTrabajo, isMinisterioTrabajo);
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
        if(this.getCargo().equals("jefe")){
            System.out.println( " es un contrato de jefe");

        }
    }

}
