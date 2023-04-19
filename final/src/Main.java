public class Main {
    public static void main(String[] args) {
        FactoryServicio fabrica = FactoryServicio.getInstance();
        Simple s1 =(Simple) fabrica.crearServicio("Simple");
        Simple s2 =(Simple) fabrica.crearServicio("Simple");
        Combo c1 =(Combo) fabrica.crearServicio("Combo");

       c1.agregar(s1);
       c1.agregar(s2);
       Empresa empresa = new Empresa("lafactory");
       empresa.agregar(s1);
       empresa.agregar(s2);
       empresa.agregar(c1);

        System.out.println(s1);
       empresa.mostrar();


    }
}
