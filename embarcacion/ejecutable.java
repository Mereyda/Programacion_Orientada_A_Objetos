package embarcacion;

import java.util.Date;

public class ejecutable {
    public static void main(String[] args) {
        Contrato luca = new ContratoXHora(new Persona("Luca","Carena",27331458,30),6, new Date(122,7,3 ), false,20,50);
        Contrato quique = new ContratoXHora(new Persona("Enrique","Delgado",20331458,35),8, new Date(122,7,3 ), true,40,200);

        System.out.println(((ContratoXHora)luca).compareTo(quique)); // casteo

        quique.incorporacionAlTrabajo();

      }
}
