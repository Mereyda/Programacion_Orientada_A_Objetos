package Clase18s;

import java.util.ArrayList;

public class Empresa {
    private String nombreEmpresa;
    private ArrayList<Reserva> reservas;

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Empresa(String nombreEmpresa, ArrayList<Reserva> reservas) {
        this.nombreEmpresa = nombreEmpresa;
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", reservas=" + reservas +
                '}';
    }
    public double recaudacionTotal(){
        double contador = 0;
        for (Reserva valor: this.getReservas()){
            contador += valor.recaudacion();
        }
        return contador;
    }
    public int cantVecesRecorrida(String estacion) throws Exception{
        int contador = 0;
        if (Recorrido.getEstaciones().contains(estacion)){
            for (Reserva reserva : this.getReservas()){
                if(reserva.getRecorrido().getDestinoInicial().equals(estacion)|| reserva.getRecorrido().getDestinoFinal().equals(estacion)){
                    contador += reserva.getCantPersonas();
                }
            }
        } else{
            throw new ExcepcionRecorrido("Estacion invalida");
        }
        return contador;
    }
}
