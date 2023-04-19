import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Servicio> servicios;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.servicios = new ArrayList<Servicio>();
    }
    //me agrega lo q cree en el main a esta coleccion//
    public void agregar(Servicio s){
        this.servicios.add(s);
    }
    public void mostrar(){
        for (Servicio s : servicios){
            System.out.println((" los nombres d eloss erv son: " +s.getNombre() + " " + "el percio es: " + s.calcularPrecio()));
        }

    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
}
