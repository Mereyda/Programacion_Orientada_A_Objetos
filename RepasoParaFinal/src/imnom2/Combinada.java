package imnom2;

import java.util.ArrayList;
import java.util.List;

public class Combinada extends Pizza{
    private List<Simple>  pizzas;


    public Combinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        this.pizzas = new ArrayList<Simple>();
    }

    public void agregar(Simple porcion){
        this.pizzas.add(porcion);
    }

    @Override
    public double calcularPrecio() {
       Double acumulador = 0.0;
        for (Simple s: pizzas){
            acumulador += s.calcularPrecio();
        }
        return acumulador / pizzas.size();

    }

}
