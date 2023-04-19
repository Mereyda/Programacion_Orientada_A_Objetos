package patronStrategy;

public class Main {
    public static void main(String[] args) {
        Punto a = new Punto(2.0, 43);
        Mapa m1 = new Mapa();
        m1.setEstrategiaTransporte(new Automovil());
        Punto b;
        System.out.println(m1.calcularTiempo(a, b);
        m1.setEstrategiaTransporte(new Caminando());
        System.out.println(m1.calcularTiempo(a, b));
        Punto a = new Punto(389, 458);
        b = new Punto(780, 599);
        Mapa westeros = new Mapa();
        westeros.setEstrategiaTransporte(new Automovil());
        System.out.println(westeros.calcularTiempo(a, b));
        //westeros.setEstrategiaTransporte(new Bicicleta());
        System.out.println(westeros.calcularTiempo(a, b));
        westeros.setEstrategiaTransporte(new Caminando());
        System.out.println(westeros.calcularTiempo(a, b));
    }

    }
}
