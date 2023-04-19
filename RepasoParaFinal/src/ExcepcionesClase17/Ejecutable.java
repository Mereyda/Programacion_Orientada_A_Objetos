package ExcepcionesClase17;

import javax.annotation.processing.FilerException;
import java.util.Date;

public class Ejecutable {
    public static void main(String[] args) throws FechaException, FilerException {
        try {
            Paciente paciente = new Paciente("pedro","gomez","1234", new Date(121,5,20));
            paciente.darAlta(new Date(121,6,20));
        } catch (FechaException excepcion){
            System.out.println(excepcion.getMessage());
        }
    }
}
