package Parcial;

public class CuentaComitente extends Cuenta{
    private String claveDeValidacion;

    public CuentaComitente(int numeroCuenta, double saldo, Cliente cliente, String claveDeValidacion) {
        super(numeroCuenta, saldo, cliente);
        this.claveDeValidacion = claveDeValidacion;
    }

    public String getClaveDeValidacion() {
        return claveDeValidacion;
    }

    public void setClaveDeValidacion(String claveDeValidacion) {
        this.claveDeValidacion = claveDeValidacion;
    }

    @Override//sobreescritura
    public void extraerEfectivo(double dinero) {
        if(this.saldo < dinero){
            System.out.println( " No puedo extraer dinero...");
        } else if  (this.saldo/2 < dinero) {
            System.out.println(" no se puede realizar la operacion sin clave de validacion");
        } else{
            this.saldo -= dinero;
            System.out.println( " extraccion realizada con exito su saldo es: "+this.saldo);
        }
    }
    //sobrecarga
    public void extraerEfectivo(double dinero, String claveDeValidacion){
        if(this.claveDeValidacion.equals(claveDeValidacion)){
            if(dinero > this.saldo){
                System.out.println( " no se puede extraer");
            } else{
                this.saldo -= dinero;
                System.out.println( " puede extraer su saldo es: " +this.saldo);

            }
        } else {
            System.out.println( " a ingresado una clave de validacion incorrecta");
            extraerEfectivo(dinero);
        }
    }

    @Override
    public void depositar(double dinero) {
        this.saldo += dinero * (99/100);
        System.out.println( " Deposito correcto " +this.saldo);
    }

    @Override
    public String toString() {
        return "CuentaComitente{" +
                "claveDeValidacion='" + claveDeValidacion + '\'' +
                ", numeroCuenta=" + numeroCuenta +
                ", saldo=" + saldo +
                ", cliente=" + cliente.toString() +
                '}';
    }
}
