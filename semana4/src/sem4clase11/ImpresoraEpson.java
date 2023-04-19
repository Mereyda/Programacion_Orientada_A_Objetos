package sem4clase11;

import java.util.Date;

public class ImpresoraEpson extends Impresora {
    public ImpresoraEpson(String modelo, String conexion, Date fechaFabricacion, int hojasDisponibles, double porcentajeTinta) {
        super(modelo, conexion, fechaFabricacion, hojasDisponibles, porcentajeTinta);
    }

    @Override
    public String imprimir() {
        return "RRRRR....RRRR... estoy imprimiendo....";
    }
}
