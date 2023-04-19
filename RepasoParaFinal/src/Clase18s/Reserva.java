package Clase18s;

public class Reserva {
    private String codigo;
    private Recorrido recorrido;
    private int cantPersonas;

    public Reserva(String codigo, Recorrido recorrido, int cantPersonas) {
        this.codigo = codigo;
        this.recorrido = recorrido;
        this.cantPersonas = cantPersonas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(Recorrido recorrido) {
        this.recorrido = recorrido;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }
    public double recaudacion(){
        if ((this.getRecorrido().getDestinoFinal().equals(Recorrido.getEstaciones().get(0)) ||
                this.getRecorrido().getDestinoFinal().equals(Recorrido.getEstaciones().get(Recorrido.getEstaciones().size()-1)))
                && (this.getRecorrido().getDestinoFinal().equals(Recorrido.getEstaciones().get(0))||
                this.getRecorrido().getDestinoInicial().equals(Recorrido.getEstaciones().get(Recorrido.getEstaciones().size()-1))) ){
            return (this.getCantPersonas()*50.0)*0.80;
            } else{
            return this.getCantPersonas()*50.0;

        }

    }

    @Override
    public String toString() {
        return "Reserva{" +
                "codigo='" + codigo + '\'' +
                ", recorrido=" + recorrido.getDestinoInicial() + "a" + recorrido.getDestinoInicial() +
              ", cantPersonas=" + cantPersonas +
                '}';
    }
}
