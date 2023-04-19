import java.util.Scanner;

public class FactoryServicio {

    private static FactoryServicio instance;

    private FactoryServicio(){

    }
    public static FactoryServicio getInstance(){
        if(instance==null)
            instance = new FactoryServicio();
        return instance;
    }
    public  Servicio crearServicio(String tipo){
        Scanner scanner = new Scanner(System.in);
        switch (tipo){

            case "Simple":
                System.out.println("ingrese nombre: ");
                 String nombre = scanner.nextLine();
                System.out.println("ingrese la descripcion: ");
                String descripcion = scanner.nextLine();
                System.out.println("ingrese su precio: ");
                Double precio = scanner.nextDouble();

                return new Simple(nombre,descripcion,precio);
            case"Combo":
                System.out.println("ingrese nombre: ");
                String nombre1 = scanner.nextLine();
                System.out.println("ingrese la descripcion: ");
                String descripcion1 = scanner.nextLine();
                System.out.println("ingrese su descuento: ");
                Double descuentp = scanner.nextDouble();
                return new Combo(nombre1,descripcion1,descuentp);
            default:
                return null;

        }
    }


}

