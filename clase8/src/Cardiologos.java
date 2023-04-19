public class Cardiologos extends Medicos {

    public Cardiologos(int matricula, String nombre, String apellido, double honorarios) {
        super(matricula, nombre, apellido, honorarios);
    }

    public double consultaCardiologo(Paciente paciente) {
        double costo = this.getHonorarios() + (paciente.getCantidadEstudios() * 300);
        if (paciente.isParticular()) {
            return costo;

        } else {
            return costo / 2;
        }
    }


}

