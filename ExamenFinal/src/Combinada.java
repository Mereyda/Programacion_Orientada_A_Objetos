import java.util.ArrayList;
import java.util.List;

public class Combinada extends Pizza{
    private List<Simple> pizzas;

    public Combinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        this.pizzas = new ArrayList<Simple>();
    }



    @Override
    public double calcularPrecio() {
        double contador = 0.0;
        for (Simple s: pizzas){
            contador += s.calcularPrecio();
        }
        return contador / pizzas.size();
    }

    public void agregar(Simple porcion){
        this.pizzas.add(porcion);
    }
}
