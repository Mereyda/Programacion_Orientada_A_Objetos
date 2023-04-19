package clase21;

public class Reparacion {
    private ReparacionState estado;
    private String articulo;
    private float presupuesto;
    private String direccion;

    public void mostrar(){
        System.out.println("Articulo: " + this.getArticulo());
        System.out.println("Presupuesto: " + this.getPresupuesto());
        System.out.println("Direccion: " + this.getDireccion());
    }

    public Reparacion(ReparacionState estado) {
        this.estado = estado;

    }



    public Reparacion(String articulo) {
        this.articulo = articulo;
        setEstado(FactoryEstado.getInstance().getEstado("EnPresupuesto", this));
    }

    public ReparacionState getEstado() {
        return estado;
    }

    public void setEstado(ReparacionState estado) {
        this.estado = estado;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void valorPresupuesto(float valor) throws Exception{
        this.estado.valorPresupuesto(valor);
    }

    public void sumarepuesto(float valor) throws Exception{
        this.estado.sumaRepuesto(valor);
    }
    public void cambiarDireccion(String direccion) throws Exception{
        this.estado.cambiarDireccion(direccion);

    }
    public void siguientePaso() throws Exception{
        this.estado.siguientePaso();
    }
}

