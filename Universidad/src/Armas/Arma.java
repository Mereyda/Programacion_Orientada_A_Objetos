package Armas;

public abstract class Arma{
    protected Policia policia;
    protected int municiones;
    protected int alcance;
    protected  String marca;
    protected double calibre;
    protected String estado;

    public Arma(Policia policia, int municiones, int alcance, String marca, double calibre, String estado) {
        this.policia = policia;
        this.municiones = municiones;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    public Policia getPolicia() {
        return policia;
    }

    public void setPolicia(Policia policia) {
        this.policia = policia;
    }

    public int getMuniciones() {
        return municiones;
    }

    public void setMuniciones(int municiones) {
        this.municiones = municiones;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCalibre() {
        return calibre;
    }

    public void setCalibre(double calibre) {
        this.calibre = calibre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean sePuedeUsar(){
        if(this.estado.equals(" en uso") && this.getCalibre()>=9){
            System.out.println( this.getMarca() + " se puede usar? ");
            return true;
        } else {
            return false;
        }

    }

}
