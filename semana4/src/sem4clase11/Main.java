package sem4clase11;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Impresora epson1 = new ImpresoraEpson("EI45", "PRI", new Date(), 100, 50.4);
        Impresora cannon1 = new ImpresoraCannon("RE50", "PR5", new Date(), 25, 25.5);


        ImpresoraCannon cannon2 = new ImpresoraCannon("RE34", "PR5", new Date(), 78, 25.5);

        System.out.println(" necesita tinta cannon sola? : " +cannon2.necesiteTinta());
        System.out.println(" mi impresion " +cannon2.necesiteTinta());

        System.out.println(epson1.toString());
        System.out.println(cannon1.toString());


        System.out.println(cannon1.imprimir());
        System.out.println(epson1.imprimir());


        }
    }

