public class Ejecutable {
    public static void main(String[] args) {

        Policia poli = new Policia("Enrique", "LaGorra", "33giefh8e");
        Arma arma1 = new ArmaCorta(poli, 300, 50, "Bersa",
                "EN USO", 9, false);

        System.out.println(arma1.sePuedeUsar());

        Arma arma2 = new ArmaLarga(poli, 500, 300, "sasa", "EN USO",
                7.62, true, "piqueteros", 4);
        Arma arma3 = new ArmaLarga(poli, 600, 700, "qqqq", "EN USO",
                7.62, false, "piqueteros", 5);
        ArmaLarga arma4 = new ArmaLarga(poli, 600, 700, "qqqq", "EN USO",
                7.62, false, "piqueteros", 5);


        //System.out.println(((ArmaLarga)arma2).compareTo(arma3));

        //System.out.println(arma4.compareTo(arma3));



    }
}
