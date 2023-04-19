package embarcacion;

import java.util.Date;

public class ContratoXHora extends Contrato implements Comparable{
    private int cantidadHorasXMes;
    private double valorHora;

    public ContratoXHora(Persona persona, int mesesDuracion, Date fechaInicioActividad, boolean selladoMinisterioTrabajo, int cantidadHorasXMes, double valorHora) {
        super(persona, mesesDuracion, fechaInicioActividad, selladoMinisterioTrabajo);
        this.cantidadHorasXMes = cantidadHorasXMes;
        this.valorHora = valorHora;
    }

    public int getCantidadHorasXMes() {
        return cantidadHorasXMes;
    }

    public void setCantidadHorasXMes(int cantidadHorasXMes) {
        this.cantidadHorasXMes = cantidadHorasXMes;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }


    @Override
    public int compareTo(Object o) {
        return this.getCantidadHorasXMes() - ((ContratoXHora)o).getCantidadHorasXMes();

    }

    @Override
    public String toString() {
        return "ContratoXHora{" +
                "cantidadHorasXMes=" + cantidadHorasXMes +
                ", valorHora=" + valorHora +
                ", persona=" + persona.toString() +
                ", mesesDuracion=" + mesesDuracion +
                ", fechaInicioActividad=" + fechaInicioActividad +
                ", selladoMinisterioTrabajo=" + selladoMinisterioTrabajo +
                '}';
    }
    //    public int compareTo(Object o) {
//        ContratoXHora comparacion = (ContratoXHora)o;
//        if(this.getCantidadHorasXMes() > comparacion.getCantidadHorasXMes()){
//            return 1;
//        } else if (this.getCantidadHorasXMes() < comparacion.getCantidadHorasXMes()){
//            return -1;
//        }else{
//            return 0;
//        }
//    }
    // compareTo = -1(cuando el objeto desde el que se compara es menor) 0(cuando son iguales) 1 (cuando el objesto desde el que se compara es mayor)
}
