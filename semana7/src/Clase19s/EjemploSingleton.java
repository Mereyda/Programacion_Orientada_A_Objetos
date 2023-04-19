package Clase19s;

public class EjemploSingleton {
    private static EjemploSingleton instance = new EjemploSingleton();

    private EjemploSingleton() {
    }

    public static EjemploSingleton getInstance() {
        return instance;
    }
}
