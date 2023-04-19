package Imnombrable;

import java.util.ArrayList;
import java.util.List;

public class CargaContenedora extends Carga{
    private double pesoContenedor;
    public List <CargaSimple> cargas = new ArrayList<>();


    public CargaContenedora(String nombre, String descripcion, double pesoContenedor) {
        super(nombre, descripcion);
        this.pesoContenedor = pesoContenedor;
    }

    public double getPesoContenedor() {
        return pesoContenedor;
    }

    public void setPesoContenedor(double pesoContenedor) {
        this.pesoContenedor = pesoContenedor;
    }


    public double calcularPeso() {
        double pesoTotal = this.pesoContenedor;
        for (int i = 0; i < cargas.size(); i++) {
            pesoTotal += cargas.get(i).getPeso();

        }
        return pesoTotal;
    }
    public void agregarCarga(CargaSimple carga){
        cargas.add(carga);
    }


}


