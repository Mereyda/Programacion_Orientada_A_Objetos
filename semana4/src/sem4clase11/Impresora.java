package sem4clase11;

import java.util.Date;

public  abstract class Impresora {
    protected String modelo;
    protected  String conexion;
    protected Date fechaFabricacion;
    protected int hojasDisponibles;
    protected double porcentajeTinta;

    public Impresora(String modelo, String conexion, Date fechaFabricacion, int hojasDisponibles, double porcentajeTinta) {
        this.modelo = modelo;
        this.conexion = conexion;
        this.fechaFabricacion = fechaFabricacion;
        this.hojasDisponibles = hojasDisponibles;
        this.porcentajeTinta = porcentajeTinta;
    }

    public boolean tienePapel(){
        return true;
    }
    public boolean necesiteTinta(){
        return true;
    }
    public abstract String imprimir(); //este es un metood abstracto//

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getHojasDisponibles() {
        return hojasDisponibles;
    }

    public void setHojasDisponibles(int hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }

    public double getPorcentajeTinta() {
        return porcentajeTinta;
    }

    public void setPorcentajeTinta(double porcentajeTinta) {
        this.porcentajeTinta = porcentajeTinta;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "modelo='" + modelo + '\'' +
                ", conexion='" + conexion + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", hojasDisponibles=" + hojasDisponibles +
                ", porcentajeTinta=" + porcentajeTinta +
                '}';
    }


}
