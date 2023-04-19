package clase8s;

public class Personaje {
    private int vida;
    private String nombre;
    private int anio;

    public Personaje(int vida, String nombre, int anio) {
        this.vida = vida;
        this.nombre = nombre;
        this.anio = anio;
    }

    public void pegar(Personaje personaje) {
        System.out.println("Estoy pegando");
        System.out.println(" soy " + this.nombre + " y le voy a pegar a : " + personaje.getNombre());
        personaje.setVida(personaje.getVida() + this.anio);


    }

    public int getVida() {

        return vida;
    }

    public void setVida(int vida) {

        this.vida = vida;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public int getAnio() {

        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


}
