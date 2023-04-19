package Interfaz;

public class Pimiento implements Comparable{
    private String tipo;
    private String color;
    private double tomano;
    private double peso;

    public Pimiento( ) {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTomano() {
        return tomano;
    }

    public void setTomano(double tomano) {
        this.tomano = tomano;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public int compareTo(Object o) {
        Pimiento p2 = (Pimiento) o;
        //nt respuesta = 0;
//        if (this.getPeso() > p2.getPeso());
//        respuesta = 1;
//        if (this.getPeso() < p2.getPeso());
//        respuesta = -1;
        return (int) (this.peso - ((Pimiento) o).getPeso());

    }
}
//el codigo de la linea 47 hsta la 51 no se ejecuta bien.