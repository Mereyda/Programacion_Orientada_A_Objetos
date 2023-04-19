package Clase18s;

import java.util.ArrayList;
import java.util.List;

public class Ejecutable {
    public static void main(String[] args) throws Exception {
        System.out.println(Recorrido.getEstaciones());

        try {
            Recorrido r1 = new Recorrido("Lujan", "Buenos Aires");
            Recorrido r2 = new Recorrido("Bragado", "Buenos Aires");
            Reserva re1 = new Reserva("a1", r1, 4);
            Reserva re2 = new Reserva("a2", r2, 4);
            System.out.println("lo recaudado en la reserva " + re1.getCodigo() + "es " + re1.recaudacion());
            System.out.println("lo recaudado en la reserva " + re2.getCodigo() + "es" + re2.recaudacion());
            Empresa e1 = new Empresa("Flecha Bus", new ArrayList<Reserva>(List.of(re1, re2)));
            System.out.println(e1.toString());
            System.out.println(e1.recaudacionTotal());
            System.out.println(e1.cantVecesRecorrida("Lujan"));
            System.out.println(e1.cantVecesRecorrida("Buenos Aires"));

        } catch (ExcepcionRecorrido e) {
            System.out.println(e.toString());

        }
    }
}

