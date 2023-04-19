package sem4;

import java.util.Objects;

public class Asteroide extends Objeto{
    private int lesion;

    public Asteroide(int posX, int posY, char direccion, int lesion) {
        super(posX, posY, direccion);
        this.lesion = lesion;
    }

    public int getLesion() {
        return lesion;
    }

    public void setLesion(int lesion) {
        this.lesion = lesion;
    }


    @Override
    public void irA(int posX, int posY, char direccion) {
        System.out.println( " choco con...");

    }

    @Override
    public String toString() {
        return "Asteroide{" +
                "posX=" + posX +
                ", posY=" + posY +
                ", direccion=" + direccion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asteroide asteroide = (Asteroide) o;
        return lesion == asteroide.lesion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lesion);
    }
}
