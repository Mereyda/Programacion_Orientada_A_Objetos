import java.util.Scanner;

public class FactoryPizza {

    private static FactoryPizza instance;

    private void FactoryPizza(){

    }
    public static FactoryPizza getInstance(){
        if(instance == null)
            instance = new FactoryPizza();
        return instance;
    }

    public Pizza mostarPizzas(String tipo){
        Scanner scanner = new Scanner(System.in);
        switch (tipo){
            case"Simple":
                System.out.println("Ingrese el nombre de la Pizza");
                String nombre = scanner.nextLine();

                System.out.println("Ingrese la descripcion");
                String descripcion = scanner.nextLine();

                System.out.println("Ingrese el precio base");
                double precio = scanner.nextDouble();
                System.out.println(" es grande");
                boolean esgrande = scanner.nextBoolean();

                return new Simple(nombre,descripcion,precio,esgrande);
            case"Combinada":
                Scanner scannerr = new Scanner(System.in);
                System.out.println("Ingrese el nombre: ");
                String nombre1= scannerr.nextLine();
                System.out.println("Ingrese la descripcion: ");
                String descripcion1= scannerr.nextLine();
                return new Combinada(nombre1,descripcion1);
            default:
                return null;


        }
    }
}
