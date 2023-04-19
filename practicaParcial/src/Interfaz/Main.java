package Interfaz;

public class Main {
    public static void main(String[] args) {
        CajaAhorro ca= new CajaAhorro();
        ca.setSaldo(100);
        ca.cobrarIntereses();

        CuentaCorriente cc = new CuentaCorriente();
        cc.setSaldo(100);
        cc.gravar(0.21);
        System.out.println( ca.informarSaldo());
        System.out.println(cc.gravar(0.21));

    }
}
