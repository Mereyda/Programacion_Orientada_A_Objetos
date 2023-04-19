public class Medicos {
    private int matricula;
    private String nombre;
    private String apellido;
    private double honorarios;

    public Medicos(int matricula, String nombre, String apellido, double honorarios) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.honorarios = honorarios;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHonorarios() {
        return honorarios;
    }

    public void setHonorarios(double honorarios) {
        this.honorarios = honorarios;
    }
}
