public class Test {
    public static void main(String[] args) {
        Simple simple1 = (Simple) FactoryPizza.getInstance().mostarPizzas("Simple");
        Simple simple2 = (Simple) FactoryPizza.getInstance().mostarPizzas("Simple");

        Combinada c1 = (Combinada) FactoryPizza.getInstance().mostarPizzas("Combinada");

        c1.agregar(simple1);
        c1.agregar(simple2);

        Pizzeria p = new Pizzeria("Pizza Loca");
        p.agregar(simple1);
        p.agregar(c1);
        p.mostrar();



    }
}
