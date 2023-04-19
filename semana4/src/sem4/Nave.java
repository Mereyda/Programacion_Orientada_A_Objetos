package sem4;

import java.util.Objects;

public class Nave extends Objeto {
    private Double velocidad;
    private int vida;

    public Nave(int posX, int posY, char direccion, Double velocidad) {
        super(posX, posY, direccion);
        this.velocidad = velocidad;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nave nave = (Nave) o;
        return vida == nave.vida && Objects.equals(velocidad, nave.velocidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(velocidad, vida);
    }

    @Override
    public void irA(int posX, int posY, char direccion) {
        System.out.println(" Soy la nave y estay a  " + this.getPosX() + " y" + this.getPosY() + " y me muevo");

    }

    public void girar(char direccion) {
        if (direccion != this.getDireccion()) {
            this.setDireccion(direccion);
            System.out.println("Soy la nave y estoy girando hacia " + direccion);
        } else {
            System.out.println("Ya estoy en esa direccion");
        }
        ;
    }
}
