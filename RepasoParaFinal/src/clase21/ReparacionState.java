package clase21;

public interface ReparacionState {
    public void valorPresupuesto( float valor) throws Exception;
    public void sumaRepuesto(float valor) throws Exception;
    public void cambiarDireccion(String nuevaDireccion) throws Exception;
    public void siguientePaso() throws Exception;


}
