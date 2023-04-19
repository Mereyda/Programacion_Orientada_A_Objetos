package Clase20s;

public class Pagando implements EstadoCarrito{
    private Carrito v;
    // Constructor que inyecta la dependencia en la clase actual
    private Producto productoAgregado;

    public Pagando(Carrito v)
    {
        this.v = v;
    }

}
