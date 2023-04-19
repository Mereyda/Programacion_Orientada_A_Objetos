public class Ejecutable {
    public static void main(String[] args) {
        Camion miCamion = new Camion("ford", "ABXXCD");

        Camion.cambiarPrecioCombustible(98.50);
        
        System.out.println( " Gasto " + miCamion.gastoCombustible(40));

        Camion camion1 = new Camion("peugeot", "245AC22");

        Camion.cambiarPrecioCombustible(40.00);

        System.out.println( "Gasto " + camion1.gastoCombustible(20) );
    }
}
