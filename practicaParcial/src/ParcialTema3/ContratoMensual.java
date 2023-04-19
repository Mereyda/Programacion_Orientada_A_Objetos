package ParcialTema3;

import java.util.Date;

public class ContratoMensual extends Contrato{
    private double salarioMensaul;
    private double hotasTotales;
    private String cargo;


    public ContratoMensual(int cantMeses, Date fechaInicioPersona, boolean fueSellado) {
        super(cantMeses, fechaInicioPersona, fueSellado);
    }
}
