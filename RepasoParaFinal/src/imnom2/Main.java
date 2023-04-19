package imnom2;

public class Main {
    public static void main(String[] args) {
        Simple s = (Simple) PizzaFactory.getInstance().generar("Simple");
       //Simple s1 = (Simple) PizzaFactory.getInstance().generar("simple");
        //Simple s2 = (Simple) PizzaFactory.getInstance().generar("simple");
        Combinada c = (Combinada) PizzaFactory.getInstance().generar("Combinada");
        //c.agregar(s);
        //c.agregar(s1);
        PizzaLoca pl = new PizzaLoca("pizzeria");

        //pl.mostrar2();

        //System.out.println(c.calcularPrecio());









    }
}
