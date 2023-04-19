public class EmpleadoContratado extends Empleado{

    private Double importePorHora;
    private Double retencionImpuesto;

    public EmpleadoContratado() {
        super("pedro", "perez", 1234);
        this.importePorHora = 7.00;
        this.retencionImpuesto = 0.86;
    }

    public Double getImportePorHora() {
        return importePorHora;
    }

    public void setImportePorHora(Double importePorHora) {
        this.importePorHora = importePorHora;
    }

    public Double getRetencionImpuesto() {
        return retencionImpuesto;
    }

    public void setRetencionImpuesto(Double retencionImpuesto) {
        this.retencionImpuesto = retencionImpuesto;
    }

    @Override
    public Double calcularSueldo(int dias) {
        return null;
    }
}
