package Examenes;

public  class ExamenFinal extends Examen implements Comparable {
    protected String temaExamen;
    private double notaOral;

    public ExamenFinal(String temaExamen, String enunciado, double nota, Alumno alumno, String temaExamen1, double notaOral) {
        super(temaExamen, enunciado, nota, alumno);
        this.temaExamen = temaExamen1;
        this.notaOral = notaOral;
    }

    public double getNotaOral() {
        return notaOral;
    }

    public void setNotaOral(double notaOral) {
        this.notaOral = notaOral;
    }

    @Override
    public String getTemaExamen() {
        return temaExamen;
    }

    @Override
    public void setTemaExamen(String temaExamen) {
        this.temaExamen = temaExamen;
    }

    @Override
    public boolean estaAprobado() {
        if (this.getNota() >= 4 && this.getNotaOral() >= 4) {
            return true;
        }
        return false;


    }


    public double calcularPromedio() {
        double resultado = (this.getNotaOral() + this.getNota()) / 2;
        return resultado;
    }

    @Override
    public int compareTo(Object o) {
        ExamenFinal examenAComparar = (ExamenFinal) o;
        double promedio1 = this.calcularPromedio();
        double promedio2 = examenAComparar.calcularPromedio();
        int resultado = 0;
        if (promedio1 < promedio2) {
            return  -1;
        } else if(promedio1 > promedio2){
            return 1;
        } else{
             return resultado;
        }
    }
}