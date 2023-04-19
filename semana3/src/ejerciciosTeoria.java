import java.util.Scanner;

public class ejerciciosTeoria {
    public static boolean esDivisible(int n, int divisor) {
        return (n % divisor == 0);
    }

    public static boolean primo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (esDivisible(numero, i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println( " ingrese su numero");

        int numero2 = lector.nextInt();
        if(primo(numero2)){
            System.out.println( " el numero ingresado es primo");
        } else{
            System.out.println( " no es primo");
        }


    }
}

