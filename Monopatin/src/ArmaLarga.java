public class ArmaLarga extends Arma implements Comparable{
    private boolean selloRENAR;
    private String justDeUso;
    private int nivel;

    public ArmaLarga(Policia policia, int alcance, int municion,
                     String marca, String estado, double calibre,
                     boolean selloRENAR, String justDeUso, int nivel) {
        super(policia, alcance, municion, marca, estado, calibre);
        this.selloRENAR = selloRENAR;
        this.justDeUso = justDeUso;
        this.nivel = nivel;
    }

    public boolean isSelloRENAR() {
        return selloRENAR;
    }

    public void setSelloRENAR(boolean selloRENAR) {
        this.selloRENAR = selloRENAR;
    }

    public String getJustDeUso() {
        return justDeUso;
    }

    public void setJustDeUso(String justDeUso) {
        this.justDeUso = justDeUso;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /*@Override
    public int compareTo(Object o) {
        ArmaLarga armalargaM4 = (ArmaLarga) o;
        if (this.getNivel() > armalargaM4.getNivel()){
            System.out.println("Tiene mayor nivel");
            return 1;
        }else if (this.getNivel() < armalargaM4.getNivel()){
            System.out.println("Tiene menor nivel");
            return -1;
        }else {
            System.out.println("Son iguales");
            return 0;
        }*/

        @Override
        public int compareTo(Object o) {
            ArmaLarga armacomparar = (ArmaLarga) o;

            int resultado = 0;

            if(this.getNivel() > armacomparar.getNivel()){
                resultado = 1;
            }
            if(this.getNivel() < armacomparar.getNivel()){
                resultado = -1;
            }
            return resultado;
        }

}

