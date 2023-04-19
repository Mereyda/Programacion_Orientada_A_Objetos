package sem2;

public class Ejecutable {
    public static void main(String[] args) {//esto es un objeto
        Macota mascotita = new Macota();
        Macota mascotita2 = new Macota();
        mascotita.nombre = "Firus";
        mascotita.raza = "policia";
        mascotita.respirar();
        System.out.println(mascotita.nombre);
        mascotita2.nombre = "Nemo";
        mascotita2.raza = "pez";
        mascotita2.respirar();
        System.out.println(mascotita2.nombre);
    }
}
