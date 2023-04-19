package patronStrategy;

public class Caminando implements StrategyTransporte{
    @Override
    public double calculaTiempo(Punto a, Punto b) {
        return a.distancia(b)/0.50366*4;
    }
}
