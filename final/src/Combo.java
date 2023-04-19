import java.util.ArrayList;
import java.util.List;

public class Combo extends Servicio{
    private double descuento;
    private List<Simple> comboSimple;

    public Combo(String nombre, String descripcion, double descuento) {
        super(nombre, descripcion);
        this.descuento = descuento;
        this.comboSimple = new ArrayList<Simple>();
    }

    public Combo() {

    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public List<Simple> getComboSimple() {
        return comboSimple;
    }

    public void setComboSimple(List<Simple> comboSimple) {
        this.comboSimple = comboSimple;
    }

    @Override
    public double calcularPrecio() {
        double precio = 0.0;
        for (Simple cadaUno : comboSimple){
            precio += cadaUno.calcularPrecio();
        }
        //return precio - this.getDescuento();
        return  precio - this.getDescuento()*precio/100;
    }

    public void agregar(Simple s){
        this.comboSimple.add(s);
    }
}
