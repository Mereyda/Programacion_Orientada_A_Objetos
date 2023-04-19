package clase11A;

public class CuentaCorriente extends Cuenta{
    private  int montoAutorizado;

    public CuentaCorriente(Cliente clientex, int saldo) {
        super(clientex, saldo);
    }
    public int getMontoAutorizado() {
        return montoAutorizado;
    }

    public void setMontoAutorizado(int montoAutorizado) {
        this.montoAutorizado = montoAutorizado;
    }

    @Override
    public int depositar() {
        return 0;
    }

    @Override
    public int depositar(int dinero) {
        return 0;
    }

    @Override
    public void extraerEfectivo() {

    }

    @Override
    public void informarSaldo() {

    }

    @Override
    public void cobrarIntereses() {

    }

    @Override
    public int depositarSaldo() {
        return 0;
    }



}
