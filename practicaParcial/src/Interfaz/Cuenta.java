package Interfaz;

public abstract class Cuenta {
    protected double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto){
        saldo += monto;
    }
    public double informarSaldo(){
        return saldo;
    }
    public abstract void extraer(double monto);
}
