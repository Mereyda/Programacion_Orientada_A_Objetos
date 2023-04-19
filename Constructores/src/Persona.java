public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void caminar() {
        System.out.println("estoy caminando...");
    }

    public void hablar() {
        System.out.println("estoy hablando...");
    }

    public void saltar() {
        System.out.println("estoy saltando");
    }

//creando otro constructor
    public Persona(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
