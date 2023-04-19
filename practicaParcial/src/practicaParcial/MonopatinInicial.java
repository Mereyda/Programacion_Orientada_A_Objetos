package practicaParcial;

import java.util.Date;

public class MonopatinInicial extends Monopatin {
    private String estado;

    public MonopatinInicial(Tecnico tecnico, Date ingresoReparacion, Date reparacionLimiteEstimada, Date inicioReal, Date reparacionFinalizada, boolean estaEnFuncionamiento, String status, String estado) {
        super(tecnico, ingresoReparacion, reparacionLimiteEstimada, inicioReal, reparacionFinalizada, estaEnFuncionamiento, status);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "MonopatinInicial{" +
                "estado='" + estado + '\'' +
                ", tecnico=" + tecnico +
                ", ingresoReparacion=" + ingresoReparacion +
                ", reparacionLimiteEstimada=" + reparacionLimiteEstimada +
                ", inicioReal=" + inicioReal +
                ", reparacionFinalizada=" + reparacionFinalizada +
                ", estaEnFuncionamiento=" + estaEnFuncionamiento +
                ", status='" + status + '\'' +
                '}';
    }

    public void estaReparado(){
        if(this.getEstado().equals(" en espera")){
        System.out.println(" su mono esta siendo reparado");
    } else{
            System.out.println(" su ono esta siendo reparado");
        }

    }
}