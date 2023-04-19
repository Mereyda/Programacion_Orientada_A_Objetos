package clase8s;

public class Mago  extends Personaje{
    private int mana;



    public Mago(int vida, String nombre, int anio) {
        super(vida, nombre, anio);
    }

    public void generarHechizo(){
        System.out.println( " estoy haciendo un hechixo");
    }
}
