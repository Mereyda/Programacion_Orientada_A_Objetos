public abstract class Arma {
    protected Policia policia;
    protected int alcance;
    protected int municion;
    protected String marca;
    protected String estado;
    protected double calibre;

    public Arma(Policia policia, int alcance, int municion, String marca, String estado, double calibre) {
        this.policia = policia;
        this.alcance = alcance;
        this.municion = municion;
        this.marca = marca;
        this.estado = estado;
        this.calibre = calibre;
    }

    public Policia getPolicia() {
        return policia;
    }

    public void setPolicia(Policia policia) {
        this.policia = policia;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getCalibre() {
        return calibre;
    }

    public void setCalibre(double calibre) {
        this.calibre = calibre;
    }

    public boolean sePuedeUsar() {
        if (this.estado.equals("EN USO") && this.calibre >= 9) {
            System.out.println(this.getMarca() + " se puede usar?");
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Arma{" +
                "policia=" + policia.toString() +
                ", alcance=" + alcance +
                ", municion=" + municion +
                ", marca='" + marca + '\'' +
                ", estado='" + estado + '\'' +
                ", calibre=" + calibre +
                '}';
    }
}
