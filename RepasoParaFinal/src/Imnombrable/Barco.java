//package Imnombrable;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Barco {
//    private String nombreBarco;
//    private List<CargaSimple> cargasimples = new ArrayList<>();
//    private List<CargaContenedora> cargascontenedoras = new ArrayList<>();
//
//
//    public Barco(String nombreBarco) {
//        this.nombreBarco = nombreBarco;
//    }
//
//    public String getNombreBarco() {
//        return nombreBarco;
//    }
//
//    public void setNombreBarco(String nombreBarco) {
//        this.nombreBarco = nombreBarco;
//    }
////    public void informe(CargaContenedora nombre, CargaSimple nombres) {
////        System.out.println("El nombre del contenedor que igreso es: " + nombre.getNombre());
////        System.out.println("La carga del contenedor es de: " + nombres.getNombre());
////        System.out.println("El peso total del contenedor es de: " + nombre.getPesoContenedor());
////    }
//
//    public void informe(){
//        double total = 0;
//        System.out.println("Las cargasSimples del barco son: ");
//        for (CargaSimple cargaSimple: cargasimples) {
//            System.out.println(cargaSimple.getNombre() + "..." + cargaSimple.calcularPeso() + "kg");
//            total += cargaSimple.calcularPeso();
//        }
//
//        System.out.println("Las cargasContenedoras del barco son: ");
//        for (CargaContenedora cargaContenedora:cargascontenedoras ){
//            System.out.println(cargaContenedora.getNombre()+"............."+cargaContenedora.calcularPeso());
//            total += cargaContenedora.getPesoContenedor();
//        }
//    }
//
//
//
//
//}
