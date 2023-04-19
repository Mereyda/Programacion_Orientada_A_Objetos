package acme;

import java.util.Date;

public class MonopatinInicial extends Monopatin {
    private String fase;

    public MonopatinInicial(Tecnico tecnico, Date fechaInicioReparacion, Date fechaPlanificada, Date fechaInicioReparacionReal, Date fechaReparacionFinalizadaReal, String status, String estado) {
        super(tecnico, fechaInicioReparacion, fechaPlanificada, fechaInicioReparacionReal, fechaReparacionFinalizadaReal, status);
        this.fase = estado;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String estado) {
        this.fase = estado;
    }

    @Override
    public String toString() {
        return "MonopatinInicial{" +
                "estado='" + fase + '\'' +
                ", tecnico=" + tecnico.toString() +
                ", fechaInicioReparacion=" + fechaInicioReparacion +
                ", fechaPlanificada=" + fechaPlanificada +
                ", fechaInicioReparacionReal=" + fechaInicioReparacionReal +
                ", fechaReparacionFinalizadaReal=" + fechaReparacionFinalizadaReal +
                ", status='" + status + '\'' +
                '}';
    }

    public void estaEsperando(){
        if(this.getFase().equals("En espera")){
            System.out.println("Su monopatin se encuentra en espera");
        }else{
            System.out.println("Su monopatin esta siendo reparado o se encuentra listo");
        }
    }
}
