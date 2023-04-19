package Clase20s;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> listaDeproductos;
    private String nombreCarrito;

    private EstadoCarrito estadodelcarrito;


    public Carrito(String nombreCarrito) {
        listaDeproductos = new ArrayList<>();
        this.nombreCarrito = nombreCarrito;

        this.setEstado(new Vacio(this));

    }

    public List<Producto> getListaDeproductos() {
        return listaDeproductos;
    }

    public void setListaDeproductos(List<Producto> listaDeproductos) {
        this.listaDeproductos = listaDeproductos;
    }

    public String getNombreCarrito() {
        return nombreCarrito;
    }

    public void setNombreCarrito(String nombreCarrito) {
        this.nombreCarrito = nombreCarrito;
    }

    public EstadoCarrito getEstadodelcarrito() {
        return estadodelcarrito;
    }

    public void setEstado(EstadoCarrito estadodelcarrito) {
        this.estadodelcarrito = estadodelcarrito;
    }
}
