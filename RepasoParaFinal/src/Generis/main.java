package Generis;

public class main {
    public static void main(String[] args) {
        Agua a = new Agua(20);
        Combustible c = new Combustible(10);

        Balde b = new Balde();
        b.setContenido(a);
        b.setContenido(c);

        System.out.println("voy a tomar" +b.obtenerContenido());
        System.out.println("tomare...." + a);
    }
}
