public class Main {
    public static void main(String[] args) {

        Auto auti1 = new Auto("ABC123", "Fiat", "premium");

     Chofer chofer1 = new Chofer("Jorge", "Lopez", new Auto("ABC123", "Ford", "AB2008"));

     chofer1 = new Chofer("Agustina", "Lopez", auti1);




     //para consultar la patente:
        System.out.println( "el chofes del " + chofer1);
        System.out.println( " Patente auto es " + chofer1.verPatente());

    }
}
