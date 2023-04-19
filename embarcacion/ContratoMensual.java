package embarcacion;

import java.util.Date;

public class ContratoMensual extends Contrato{
    private double salarioMensual;
    private int horasTotales;
    private String cargo;

    public ContratoMensual(Persona persona, int mesesDuracion, Date fechaInicioActividad, boolean selladoMinisterioTrabajo, double salarioMensual, int horasTotales, String cargo) {
        super(persona, mesesDuracion, fechaInicioActividad, selladoMinisterioTrabajo);
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
        if(this.getCargo().equals("jefe")){
            System.out.println("Es un contrato de Jefe");
        }else{
            System.out.println("Empleado raso");
        }
    }

    @Override
    public String toString() {
        return "ContratoMensual{" +
                "salarioMensual=" + salarioMensual +
                ", horasTotales=" + horasTotales +
                ", cargo='" + cargo + '\'' +
                ", persona=" + persona.toString() +
                ", mesesDuracion=" + mesesDuracion +
                ", fechaInicioActividad=" + fechaInicioActividad +
                ", selladoMinisterioTrabajo=" + selladoMinisterioTrabajo +
                '}';
    }
}
