package sem4clase11;

import java.util.Date;

public class ImpresoraCannon extends Impresora{

    public boolean necesiteTinta(){
        return false;
    }

    public ImpresoraCannon(String modelo, String conexion, Date fechaFabricacion, int hojasDisponibles, double porcentajeTinta) {
        super(modelo, conexion, fechaFabricacion, hojasDisponibles, porcentajeTinta);
    }

    @Override
    public String imprimir() {
        return  " Estoy imprimiendo a la cannon ";
    }
}
