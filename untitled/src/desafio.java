

//Implementar un programa que nos permite mostrar por consola los primeros “n” números
//        primeros, siendo “n” un valor numérico ingresado por consola. Por ejemplo: Con n=7, lo
//        que debería devolver el programa es “Los primeros 7 números primos son: 2, 3, 5, 7, 11, 13,
//        17”.


import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("indique el numero");
        int numero = scanner.nextInt();
        Integer[] primos = numerosPrimos(numero);

        for (int i = 0; i < primos.length; i++) {
            System.out.println(primos[i]);
        }


    }

    public static Integer[] numerosPrimos(int numero) {
        int contadorPrimos = 0;
        Integer[] array = new Integer[numero];
        int numeroAcomprobar = 2;
        while (contadorPrimos < numero) {
            boolean esPrimo = true;
            for (int i = 2; i < numeroAcomprobar; i++) {
                if (numeroAcomprobar % i == 0) {
                    esPrimo = false;
                    break;
                }

            }
            if (esPrimo == true) {
                array[contadorPrimos] = numeroAcomprobar;
                contadorPrimos++;
            }
            numeroAcomprobar++;
        }
        return array;
    }
}

