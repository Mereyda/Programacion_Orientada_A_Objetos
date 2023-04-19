package Armas;

public class ArmaLarga extends Arma implements Comparable{
    private boolean selloRENAR;
    private String justUso;
    private int nivel;

    public ArmaLarga(Policia policia, int municiones, int alcance, String marca, double calibre, String estado, boolean selloRENAR, String justUso, int nivel) {
        super(policia, municiones, alcance, marca, calibre, estado);
        this.selloRENAR = selloRENAR;
        this.justUso = justUso;
        this.nivel = nivel;
    }

    public boolean isSelloRENAR() {
        return selloRENAR;
    }

    public void setSelloRENAR(boolean selloRENAR) {
        this.selloRENAR = selloRENAR;
    }

    public String getJustUso() {
        return justUso;
    }

    public void setJustUso(String justUso) {
        this.justUso = justUso;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public int compareTo(Object o) {
        ArmaLarga armacomparar = (ArmaLarga)o;
        int resultado = 0;
        if(this.getNivel() < armacomparar.getNivel()){
            resultado =1;
        }
        if(this.getNivel() > armacomparar.getNivel()){
            resultado = -1;
        }
        return resultado;
    }
}
