package Imnombrable;

public class CargaSimple extends Carga{
    private double peso;
    private boolean refrigeracion;

    public CargaSimple(String nombre, String descripcion, double peso, boolean regrigeracion) {
        super(nombre, descripcion);
        this.peso = peso;
        this.refrigeracion = regrigeracion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isRefrigeracion() {
        return refrigeracion;
    }

    public void setRefrigeracion(boolean refrigeracion) {
        this.refrigeracion = refrigeracion;
    }

    public void calcularPeso() {
        if( isRefrigeracion() == true){
            System.out.println(this.getPeso()*1.10);
        } else{
            System.out.println(this.getPeso());
        }

    }
}
