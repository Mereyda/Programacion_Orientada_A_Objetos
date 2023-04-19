package Parcial;

public class Cliente {
    private int numeroCliente;
    private String apellido;
    private int dni;
    private  int cuit;

    public Cliente(int numeroCliente, String apellido, int dni, int cuit) {
        this.numeroCliente = numeroCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroCliente=" + numeroCliente +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", cuit=" + cuit +
                '}';
    }
}
