public class Paciente {
    private int dni;
    private String nombre;
    private int edad;
    private String seguro;
    private boolean particular;
    private Medicos medico;
    private int cantidadEstudios;
    private boolean cirugia;
    private boolean alta;

    public Paciente(int dni, String nombre, int edad, String seguro, boolean particular, Medicos medico, int cantidadEstudios, boolean cirugia, boolean alta) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.seguro = seguro;
        this.particular = particular;
        this.medico = medico;
        this.cantidadEstudios = cantidadEstudios;
        this.cirugia = cirugia;
        this.alta = alta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public boolean isParticular() {
        return particular;
    }

    public void setParticular(boolean particular) {
        this.particular = particular;
    }

    public Medicos getMedico() {
        return medico;
    }

    public void setMedico(Medicos medico) {
        this.medico = medico;
    }

    public int getCantidadEstudios() {
        return cantidadEstudios;
    }

    public void setCantidadEstudios(int cantidadEstudios) {
        this.cantidadEstudios = cantidadEstudios;
    }

    public boolean isCirugia() {
        return cirugia;
    }

    public void setCirugia(boolean cirugia) {
        this.cirugia = cirugia;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }
}

