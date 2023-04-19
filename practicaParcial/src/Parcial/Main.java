package Parcial;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new CajaAhorro(1234, 800, new Cliente(350, "Perez", 33456789, 249412472), 7);
//        cuenta1.extraerEfectivo(9000);
//        ((CajaAhorro)cuenta1).cobrarInteres();// casteo que se comporte como caja de ahorro

//        CajaAhorro ca1 = new CajaAhorro(1234, 500,new Cliente(50,"Garcia", 94124711, 259999999),10);
//
//        ca1.depositar(2500);
//        ca1.extraerEfectivo(500);
//        ca1.cobrarInteres();

        Cuenta comitente = new CuentaComitente(123, 9000.0, new Cliente(25, "Garcia", 94124722, 249214722), "pepito");
        comitente.extraerEfectivo(4502);

        //((CuentaComitente) comitente).extraerEfectivo(8000, "pepito");

        //System.out.println(comitente.toString());
        System.out.println(comitente.getCliente());


    }
}
