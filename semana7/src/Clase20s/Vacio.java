package Clase20s;

public class Vacio implements EstadoCarrito{


    private Carrito v;
    // Constructor que inyecta la dependencia en la clase actual


    public Vacio(Carrito v)
    {
        this.v = v;
    }

}
