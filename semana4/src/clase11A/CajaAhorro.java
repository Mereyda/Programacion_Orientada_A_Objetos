package clase11A;

public class CajaAhorro extends Cuenta{

    public double tasaInteres;

    public CajaAhorro(Cliente clientex, int saldo) {
        super(clientex, saldo);
    }



    @Override
    public int depositar(int dinero) {
        return dinero;
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

    @Override
    public int depositar() {
        System.out.println(" tu nuevo saldo es ");
        return 0;
    }

    @Override
    public String toString() {
        return "CajaAhorro{" +
                "tasaInteres=" + tasaInteres +
                ", clientex=" + clientex +
                ", saldo=" + saldo +
                '}';
    }
}
