package practicaParcial;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Monopatin mono1 = new MonopatinProfesional(new Tecnico("juan", "queti", 24659890, "AB123"), new Date(122, 7, 10), new Date(122, 4, 11),new Date(122, 9, 4), new Date(122, 4, 4), true, "finalizado", "45");
        Monopatin mono2 = new MonopatinProfesional(new Tecnico("juan", "queti", 24659890, "AB123"), new Date(122, 7, 10), new Date(122, 4, 11),new Date(122, 9, 4), new Date(122, 4, 4), true, "finalizado", "45");

        System.out.println(((MonopatinProfesional)mono1).compareTo(mono2));

    }
}
