package sem4;

public class Main {
    public static void main(String[] args) {
        Asteroide asteroide = new Asteroide(1, 4, '0', 30);
        Nave nave = new Nave(3, 1, 'S', 2.5);

        System.out.println(" estoy confundido");
        asteroide.irA(3, 7, 'N');

    }
}
