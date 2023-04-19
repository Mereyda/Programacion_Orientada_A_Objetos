package Parcial;

public class CajaAhorro extends Cuenta{
    private double tasaDeInteres;

    public CajaAhorro(int numeroCuenta, double saldo, Cliente cliente, double tasaDeInteres) {
        super(numeroCuenta, saldo, cliente);
        this.tasaDeInteres = tasaDeInteres;
    }

    public double getTasaDeInteres() {
        return tasaDeInteres;
    }

    public void setTasaDeInteres(double tasaDeInteres) {
        this.tasaDeInteres = tasaDeInteres;
    }

    public CajaAhorro(int numeroCuenta, double saldo, Cliente cliente) {
        super(numeroCuenta, saldo, cliente);
    }

    @Override
    public void extraerEfectivo(double dinero) {
        if(dinero <= this.saldo){
            this.saldo -= dinero;
            System.out.println(" su nuevo saldo es: " + this.saldo);
        } else{
            System.out.println( " su saldo es insuficiente: " +this.saldo);
        }
    }

    @Override
    public void depositar(double dinero) {
        this.saldo += dinero;
        System.out.println( " su nuevo saldo es: " +this.saldo);

    }

    public void cobrarInteres(){
        this.saldo += this.saldo * (tasaDeInteres/100);
        System.out.println( " se cobraron los intereses y su nuevo saldo es: " +this.saldo);

    }

}
