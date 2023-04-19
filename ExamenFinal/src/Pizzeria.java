import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private String nombre;
    private List<Pizza> pizzalista;

    public Pizzeria(String nombre) {
        this.nombre = nombre;
        this.pizzalista = new ArrayList<Pizza>();
    }

    public void mostrar(){
        for(Pizza p : pizzalista){
            System.out.println("Nombre " + p.getNombre());
            System.out.println(" Nombre " + p.calcularPrecio());
        }

    }

    public void agregar(Pizza porcion){
        this.pizzalista.add(porcion);

    }

}
