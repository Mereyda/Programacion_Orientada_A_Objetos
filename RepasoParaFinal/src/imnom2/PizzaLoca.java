package imnom2;

import java.util.ArrayList;
import java.util.List;

public class PizzaLoca {
    private String nombre;
    private List<Pizza> listaPizza;

    public PizzaLoca(String nombre) {
        this.nombre = nombre;
        this.listaPizza = new ArrayList<>();
    }

    public void agregar(Pizza porcion){
        this.listaPizza.add(porcion);
    }

    public void mostrar(){
        for (int i = 0; i<this.listaPizza.size(); i++){
            if (this.listaPizza.get(i).getNombre()=="Simple"){
                System.out.println("Nombre: " +this.listaPizza.get(i).getNombre());
                System.out.println("Nombre: " +this.listaPizza.get(i).calcularPrecio());
        }


    }

    }
    public void mostrar2(){
        for ( Pizza p : listaPizza){
            System.out.println( " nombre" + p.getNombre());
            System.out.println( " nombre" + p.calcularPrecio());
        }
    }
}

