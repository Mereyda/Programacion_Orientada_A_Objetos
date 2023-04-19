public class Adopcion {
    private String raza;
    private String nombre;
    private int anio;
    private Double peso;
    private boolean adopcion;
    private boolean chip;
    private boolean lastimado;

    public Adopcion(String raza, String nombre, int anio, Double peso, boolean adopcion, boolean chip, boolean lastimado) {
        this.raza = raza;
        this.nombre = nombre;
        this.anio = anio;
        this.peso = peso;
        this.adopcion = adopcion;
        this.chip = chip;
        this.lastimado = lastimado;
    }
    public Adopcion(String raza, String nombre, int anio, Double peso, boolean chip, boolean lastimado) {
        this.raza = raza;
        this.nombre = nombre;
        this.anio = anio;
        this.peso = peso;
        this.chip = chip;
        this.lastimado = lastimado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
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

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public boolean isAdopcion() {
        return adopcion;
    }

    public void setAdopcion(boolean adopcion) {
        this.adopcion = adopcion;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public boolean isLastimado() {
        return lastimado;
    }

    public void setLastimado(boolean lastimado) {
        this.lastimado = lastimado;
    }
    public void edadOrientacion() {
        if (this.chip) {
            System.out.println(" El perro " + this.nombre + " nacio en  " + this.anio + " y al tener chip no se perdera");
        } else {
            System.out.println(" El perro " + this.nombre + " nacio en " + this.anio + " y al no tener chip se perdera!!");
        }
    }
        public void esAdoptable(){
            if(this.peso > 5 && !this.lastimado){
                System.out.println("el perro " + this.nombre + " puede ser adoptado");
                this.adopcion = true;
            }else{
                System.out.println("el perro " + this.nombre + " no cumple con los requisitos para ser adoptado");
                this.adopcion = false;
            }
        }

    }







