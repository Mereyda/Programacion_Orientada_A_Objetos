package PrimerParcial;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
            Persona p1 = new Persona("Mereyda","Garcia", 94124722, 35);
            Persona p2 = new Persona("Juan", "Granada", 45030412, 34);
            ContratoXHora ch = new ContratoXHora(p1, 12, new Date(122,11,30),true,45.0,250);
            ContratoMensual cm = new ContratoMensual(p2,9,new Date(122,4,15),true,2800.0,60,"es jefe");
        System.out.println(ch.puedeTrabajar());
        System.out.println(cm.puedeTrabajar());


    }
}
