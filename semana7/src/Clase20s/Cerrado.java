package Clase20s;

public class Cerrado implements EstadoCarrito{
    private Carrito v;
    // Constructor que inyecta la dependencia en la clase actual
    private Producto productoAgregado;

    public Cerrado(Carrito v)
    {
        this.v = v;
    }

}
