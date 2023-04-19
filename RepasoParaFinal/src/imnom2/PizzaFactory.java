package imnom2;

import java.util.Scanner;

public class PizzaFactory {
    private static PizzaFactory instance;
    private void PizzaFactory(){

    }


    public static PizzaFactory getInstance(){
        if(instance == null)
            instance = new PizzaFactory();
        return instance;
    }

//    public static Pizza generar(String s){
//        switch (s){
//            case "Simple":
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("ingrese el nombre");
//                String nombre = scanner.nextLine();
//                System.out.println("ingrese la direccion");
//                String descripcion = scanner.nextLine();
//                System.out.println("ingrese el precio base");
//
//                return new  Simple();
//            case "Combinada":
//
//
//            default:
//                return null;
//        }
//    }

    public Pizza generar (String s){
        switch (s){
            case "Simple":
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese el nombre: ");
                String nombre = scanner.nextLine();

                System.out.println("Ingrese la descripcion: ");
                String descripcion = scanner.nextLine();

                System.out.println("Ingrese el precio base: ");
                Double precioBase = scanner.nextDouble();

                System.out.println("Ingrese el esGrande: ");
                Boolean esGrande = scanner.nextBoolean();

                return new Simple(nombre,descripcion,precioBase,esGrande);
            case "Combinada":
                Scanner scannerr = new Scanner(System.in);
                System.out.println("Ingrese el nombre: ");
                String nombree = scannerr.nextLine();
                System.out.println("Ingrese la descripcion: ");
                String descripcionn = scannerr.nextLine();
                return new Combinada(nombree,descripcionn);
            default:
                return null;
        }
    }
}
