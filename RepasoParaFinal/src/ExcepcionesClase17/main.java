package ExcepcionesClase17;

public class main {
    public static void main(String[] args) {
        try {
            Fecha fecha = new Fecha(10, 12, 2020);
        } catch (Exception e) {
            System.out.println(" los valores son invalidos");
        }
    }
}
