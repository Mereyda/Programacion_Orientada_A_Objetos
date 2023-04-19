package imnom2;

public class Simple extends Pizza{
    private double precioBase;
    private boolean esGrande;



    public Simple(String nombre, String descripcion, double precioBase, boolean esGrande) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.esGrande = esGrande;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isEsGrande() {
        return esGrande;
    }

    public void setEsGrande(boolean esGrande) {
        this.esGrande = esGrande;
    }

    @Override
    public double calcularPrecio() {
        if(isEsGrande())
            return precioBase *2;
        return precioBase;

    }
}
