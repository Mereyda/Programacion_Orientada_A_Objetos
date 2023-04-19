package Clase18s;

public class ExcepcionRecorrido extends Exception{
    public ExcepcionRecorrido(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Error: " + this.getMessage();
    }
}
