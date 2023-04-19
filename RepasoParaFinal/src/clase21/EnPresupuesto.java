package clase21;

public class EnPresupuesto implements ReparacionState {
    Reparacion t;

    public EnPresupuesto(Reparacion t) {
        this.t = t;
        System.out.println(" en EnPresupuesto");
        t.mostrar();
    }

    @Override
    public void valorPresupuesto(float valor) throws Exception {
        t.setPresupuesto(valor);

    }

    @Override
    public void sumaRepuesto(float valor) throws Exception {
        throw new Exception("no se puede sumar repuesto");

    }

    @Override
    public void cambiarDireccion(String nuevaDireccion) throws Exception {
        throw new Exception("no se puede cambiar la direccion");

    }

    @Override
    public void siguientePaso() throws Exception {
        this.t.setEstado(FactoryEstado.getInstance().getEstado("EnProceso",t));

    }
}
