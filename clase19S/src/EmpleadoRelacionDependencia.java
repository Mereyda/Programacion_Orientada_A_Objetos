public class EmpleadoRelacionDependencia extends Empleado{
    private Double sueldoMensual;


    public EmpleadoRelacionDependencia() {
        super("pedro", "perez", 123);
        this.sueldoMensual = 1000.00;
    }

    public Double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(Double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public Double calcularSueldo(int dias) {
        return null;
    }


}
