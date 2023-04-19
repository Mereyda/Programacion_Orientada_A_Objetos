public class Simple extends  Servicio{

    private double precio;

    public Simple(String nombre, String descripcion, double precio) {
        super(nombre, descripcion);
        this.precio = precio;
    }

    public Simple() {
        super();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        if(nombre.equals("Colocacion")){
            return precio * 1.1;
        }
        return precio;
    }
}
