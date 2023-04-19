package acme;

import java.util.Date;

public class ejecutable {
    public static void main(String[] args) {
        Monopatin monopatin1 = new MonopatinProfesional(new Tecnico("Rocio","Bernardita", 27800454,456),new Date(122,7,05),new Date(122,7,30),new Date(122,7,10), new Date(122,7,30), "Finalizado",4,5,"220");
        Monopatin monopatin2 = new MonopatinProfesional(new Tecnico("Mereyda","Garcia", 31800454,457),new Date(122,7,05),new Date(122,7,30),new Date(122,7,10), new Date(122,7,30), "Por reparar",8,5,"220");
        System.out.println(((MonopatinProfesional)monopatin1).compareTo(monopatin2));

    }
}
