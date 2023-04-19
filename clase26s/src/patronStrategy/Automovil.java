package patronStrategy;

public class Automovil implements StrategyTransporte{
    @Override
    public double calculaTiempo(Punto a, Punto b) {
       return a.distancia(b)/0.40366*1.5;
    }
}
