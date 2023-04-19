package ExcepcionesClase17;

public class FechaException extends Exception{

    public FechaException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "ERROR";
    }
}
