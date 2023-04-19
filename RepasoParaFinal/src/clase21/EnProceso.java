package clase21;

public class EnProceso implements ReparacionState{

    Reparacion t;

    public EnProceso(Reparacion t) {
        this.t = t;
        System.out.println(" en EnProceso");
        t.mostrar();
    }


    @Override
    public void valorPresupuesto(float valor) throws Exception {
        throw new Exception("no se puede pasar presup");

    }

    @Override
    public void sumaRepuesto(float valor) throws Exception {
        t.setPresupuesto((t.getPresupuesto()+valor));

    }

    @Override
    public void cambiarDireccion(String nuevaDireccion) throws Exception {
        throw new Exception("no se puede cambiar direccion");

    }

    @Override
    public void siguientePaso() throws Exception {
        this.t.setEstado(FactoryEstado.getInstance().getEstado("ParaEnvio",t));

    }
}
