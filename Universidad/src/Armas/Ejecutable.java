package Armas;

public class Ejecutable {
    public static void main(String[] args){
        Policia poli = new Policia("Poli", "Perez","ab12");
        Arma arma1 = new ArmaCorta(poli,500,300,"car",9.0,"en uso",  false);

        System.out.println(arma1.sePuedeUsar());
        Arma arma2 = new ArmaLarga(poli,200,500,"bersa",9.5,"En uso",true,"delitos",4);

        Arma arma3 = new ArmaLarga(poli,600,250,"cal",7.8,"en uso",false,"delincuentes",3);
         Arma arma4 = new ArmaLarga(poli,600,250,"abc",8.0,"en uso",true,"delitos",3);

        System.out.println(((ArmaLarga)arma2).compareTo(arma3));
        //System.out.println(arma4.compareTo(arma3));


    }
}
