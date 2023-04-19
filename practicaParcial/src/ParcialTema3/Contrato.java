package ParcialTema3;

import java.util.Date;

public class Contrato {
    private int cantMeses;
    private Date fechaInicioPersona;
    private boolean fueSellado;

    public Contrato(int cantMeses, Date fechaInicioPersona, boolean fueSellado) {
        this.cantMeses = cantMeses;
        this.fechaInicioPersona = fechaInicioPersona;
        this.fueSellado = fueSellado;
    }
}
