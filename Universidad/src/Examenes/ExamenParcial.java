package Examenes;

public class ExamenParcial extends Examen {
    private int unidad;
    private int intentos;

    public ExamenParcial(String temaExamen, String enunciado, double nota, Alumno alumno, int unidad, int intentos) {
        super(temaExamen, enunciado, nota, alumno);
        this.unidad = unidad;
        this.intentos = intentos;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }


    @Override
    public boolean estaAprobado() {
        return false;

    }

    public void sePuedeRecuperar() {
        if (this.getUnidad() <= 3) {
            System.out.println(" se puede recuperar, usted ya recuperi " + this.getIntentos());

        } else if (this.getUnidad() > 3 && this.getIntentos() < 2) {
            System.out.println(" se puede recuperar dos veces");
        } else {
            System.out.println(" debe recursar la materia");
        }

    }
    public void intentos(){
        setIntentos(getIntentos() + 1);
        System.out.println(" tiene variaos intentos");
    }
}