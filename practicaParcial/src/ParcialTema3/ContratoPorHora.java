package ParcialTema3;

import java.util.Date;

public class ContratoPorHora extends  Contrato{
    private int cantHorasContratadasMes;
    private double valorHora;

    public ContratoPorHora(int cantMeses, Date fechaInicioPersona, boolean fueSellado) {
        super(cantMeses, fechaInicioPersona, fueSellado);
    }
}
