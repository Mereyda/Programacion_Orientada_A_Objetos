package patronStrategy;

public class Mapa {
    private StrategyTransporte estrategiaTransporte;


    public void setEstrategiaTransporte(StrategyTransporte estrategiaTransporte) {
        this.estrategiaTransporte = estrategiaTransporte;
    }


    public StrategyTransporte getEstrategiaTransporte() {
        return estrategiaTransporte;
    }

    public double calcularTiempo(Punto a, Punto b){
        return estrategiaTransporte.calculaTiempo(a,b);

    }
}
