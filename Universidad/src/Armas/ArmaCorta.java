package Armas;

public class ArmaCorta extends Arma{
    private boolean automatica;

    public ArmaCorta(Policia policia, int municiones, int alcance, String marca, double calibre, String estado, boolean automatica) {
        super(policia, municiones, alcance, marca, calibre, estado);
        this.automatica = automatica;
    }

    public boolean isAutomatica() {
        return automatica;
    }

    public void setAutomatica(boolean automatica) {
        this.automatica = automatica;
    }

    public boolean distaciaDeDisparo(){
        if(this.alcance > 200){
            return true;
        } else{
            return false;
        }
    }
}
