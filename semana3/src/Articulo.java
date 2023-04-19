public class Articulo {
    private String declatacion;
    private  double precioVenta;
    private int stock;

    public boolean hayStock(){
        return stock > 0;
    }
    public double consultarPrecio(){
        return precioVenta;
    }
    public Articulo(String declatacion, double precioVenta, int stock) {
        this.declatacion = declatacion;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public String getDeclatacion() {
        return declatacion;
    }

    public void setDeclatacion(String declatacion) {
        this.declatacion = declatacion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public static void main(String[] args) {
        Articulo articulo = new Articulo("Mesas", 250.0, 50);
        if(articulo.hayStock()){
            System.out.println( " el stock disponible es: " +articulo.stock); //aca accedo a un atribito
        }
        System.out.println(" El precio de venta es: " +articulo.consultarPrecio()); //aca accedo a un metodo
    }
}
