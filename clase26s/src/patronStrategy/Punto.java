package patronStrategy;

import static java.lang.Math.abs;

public class Punto {
    private double longitud;
    private double latitud;


    public Punto(double longitud, double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    public double disntancia(Punto b){
        return abs(this.latitud - b.getLatitud()) + abs(this.longitud - b.getLongitud());
    }
}
