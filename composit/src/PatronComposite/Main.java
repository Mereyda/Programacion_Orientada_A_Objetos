package PatronComposite;

public class Main {
    public static void main(String[] args) {
        Figura rueda = new Circulo(1);
        Figura cuerpoVagon = new Rectangulo(2,3);
        Figura chimenea = new Rectangulo(1,1);
        Figura frenteLocomotora = new Triangulo(1,2);


       FiguraCompuesta locomotora = new FiguraCompuesta();
        locomotora.agregar(rueda);
        locomotora.agregar(rueda);
        locomotora.agregar(rueda);
        locomotora.agregar(cuerpoVagon);
        locomotora.agregar(chimenea);
        locomotora.agregar(frenteLocomotora);
        System.out.println(locomotora.calcularArea());

    }
}
