package Examenes;

public class Ejecutable {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("pedro", "perez", 123);
        ExamenFinal e1 = new ExamenFinal("herencia","ejercicio2", 5.50, new Alumno("pablo", "Prez", 123), " habcd", 8.0);
        ExamenFinal poo = new ExamenFinal("herencia","ejercicio2", 5.50, new Alumno("pablo", "Prez", 123), " habcd", 8.0);
        ExamenFinal dt = new ExamenFinal("herencia","ejercicio2", 5.50, new Alumno("pablo", "Prez", 123), " habcd", 8.0);
        System.out.println(e1.calcularPromedio());
//        System.out.println(poo.calcularPromedio());
//        System.out.println(dt.calcularPromedio());

        ExamenParcial e3 = new ExamenParcial("abd", " ta te ti", 7.5, a1, 2, 2);
        e3.sePuedeRecuperar();
        //e3.setIntentos(2);
        System.out.println(e3.getIntentos());

    }
}