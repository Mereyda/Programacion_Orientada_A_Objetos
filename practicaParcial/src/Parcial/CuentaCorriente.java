package Parcial;

public class CuentaCorriente extends Cuenta{
    private double montoAutorizado;

    public CuentaCorriente(int numeroCuenta, double saldo, Cliente cliente, double montoAutorizado) {
        super(numeroCuenta, saldo, cliente);
        this.montoAutorizado = montoAutorizado;
    }

    public double getMontoAutorizado() {
        return montoAutorizado;
    }

    public void setMontoAutorizado(double montoAutorizado) {
        this.montoAutorizado = montoAutorizado;
    }

    @Override
    public void extraerEfectivo(double dinero) {
        if(dinero > this.saldo + this.montoAutorizado){
            System.out.println(" Su saldo es insuficiente");
        } else if(dinero > this.saldo){
            this.montoAutorizado -= dinero - this.saldo;
            this.saldo = 0;
            System.out.println( " su saldo es 0 y su monto autorizado restantes es: " +this.montoAutorizado);

        } else{
            this.saldo -= dinero;
            System.out.println( " su saldo es: " +this.saldo);

        }

    }

    @Override
    public void depositar(double dinero){
        this.saldo += dinero;
        System.out.println( " su nuevo saldo es: " +this.saldo);

    }

}
