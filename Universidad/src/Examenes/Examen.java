package Examenes;

public abstract class Examen {
    private String temaExamen;
    private String enunciado;
    private double nota;
    private Alumno alumno;


    public Examen(String temaExamen, String enunciado, double nota, Alumno alumno) {
        this.temaExamen = temaExamen;
        this.enunciado = enunciado;
        this.nota = nota;
        this.alumno = alumno;
    }

    public String getTemaExamen() {
        return temaExamen;
    }

    public void setTemaExamen(String temaExamen) {
        this.temaExamen = temaExamen;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public abstract boolean estaAprobado();

}
