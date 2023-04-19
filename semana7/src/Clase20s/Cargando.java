package Clase20s;

public class Cargando implements EstadoCarrito {

    private Carrito v;
    // Constructor que inyecta la dependencia en la clase actual
    private Producto productoAgregado;

    public Cargando(Carrito v)
    {
        this.v = v;
    }

}
