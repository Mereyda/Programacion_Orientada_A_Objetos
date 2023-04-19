package clase8s;

public class Main {
    public static void main(String[] args) {
       Mago m1 = new Mago(2, "mago", 2020);
       Mago m2 = new Mago(3, "mag", 25);

       Espadachin e1 = new Espadachin(1, "momo", 5, 4);
       Espadachin e2 = new Espadachin(200, "lis", 8, 3);


        System.out.println(e1.getVida());


        m1.pegar(m2);

        m2.pegar(m2);

        e2.pegar(m1);

    }
}
