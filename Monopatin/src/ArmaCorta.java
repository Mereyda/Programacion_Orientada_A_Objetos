public class ArmaCorta extends Arma {
    private boolean automatica;

    public ArmaCorta(Policia policia, int alcance, int municion, String marca,
                     String estado, double calibre, boolean automatica) {
        super(policia, alcance, municion, marca, estado, calibre);
        this.automatica = automatica;
    }

    public boolean isAutomatica() {
        return automatica;
    }

    public void setAutomatica(boolean automatica) {
        this.automatica = automatica;
    }

    public boolean distanciaDisparado() {
        if (this.alcance > 200) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "ArmaCorta{" +
                "automatica=" + automatica +
                ", policia=" + policia +
                ", alcance=" + alcance +
                ", municion=" + municion +
                ", marca='" + marca + '\'' +
                ", estado='" + estado + '\'' +
                ", calibre=" + calibre +
                '}';
    }
}
