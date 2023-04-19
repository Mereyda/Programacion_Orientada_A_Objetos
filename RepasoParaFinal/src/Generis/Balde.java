package Generis;

public class Balde<T> {
    private Object contenido;

    public Balde() {
    }

    public Object getContenido() {
        return contenido;
    }

    public void setContenido(Object contenido) {
        this.contenido = contenido;
    }

    public  void llenar(Object contenido){
        this.contenido = contenido;
        System.out.println("voy a tomar agua");
    }
    public Object obtenerContenido(){
        return contenido;
    }

    @Override
    public String toString() {
        return "Balde{" +
                "contenido=" + contenido +
                '}';
    }
}
