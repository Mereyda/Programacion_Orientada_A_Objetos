package Interfaz;

public class Prueba {
    public static void main(String[] args) {
        Pimiento p1 = new Pimiento();
        p1.setPeso(200);
        p1.setColor("amarillo");

        Pimiento p2 = new Pimiento();
        p2.setColor("rojo");
        p2.setPeso(350);

        if(p1.compareTo(p2) > 0){
            System.out.println("pimiento amarillo es mayor al rojo");
        } else if(p1.compareTo(p2) < 0){
            System.out.println("pimiento rojo es mayor al amarillo");
        } else {
            System.out.println("pimiento rojo es igual al amarillo");
        }


    }
}
