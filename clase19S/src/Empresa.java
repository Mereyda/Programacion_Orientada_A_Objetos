public class Empresa {
    private  String razonSocial;
    private Empleado empleado;

    public Empresa(String razonSocial, Empleado empleado) {
        this.razonSocial = razonSocial;
        this.empleado = empleado;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
