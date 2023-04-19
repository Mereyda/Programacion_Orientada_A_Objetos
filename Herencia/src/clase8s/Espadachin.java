package clase8s;

public class Espadachin extends Personaje {
    private int alcance;

    public Espadachin(int vida, String nombre, int anio, int alcance) {
        super(vida, nombre, anio);
    }



    public int getAlcance() {

        return alcance;
    }

    public void setAlcance(int alcance) {

        this.alcance = alcance;
    }

    public void usarEspada(){

        System.out.println("estoy pegando con mi espada");
    }

    public void picar(Personaje personaje){
        System.out.println( "A " + this.getNombre() + " esta picando " +personaje.getNombre() + " a");
        System.out.println(" vida de " + personaje.getNombre());
        System.out.println( " ataque " + this.getNombre());

    }
}
