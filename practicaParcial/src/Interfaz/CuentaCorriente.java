package Interfaz;

public class CuentaCorriente extends Cuenta implements GravarImpuesto{
    private double descubiertoPermitido;

    public void setDescubiertoPermitido(double descubiertoPermitido) {
        this.descubiertoPermitido = descubiertoPermitido;
    }



    @Override
    public void extraer(double monto) {
        if(informarSaldo() > monto){
            setSaldo((informarSaldo() - monto));
        }
    }

    @Override
    public double gravar(double porcentaje) {
        return this.informarSaldo() * porcentaje;
    }
}
