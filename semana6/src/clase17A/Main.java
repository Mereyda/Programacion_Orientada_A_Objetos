package clase17A;

public class Main {

    public static void main(String[] args) throws FechaException {

        try {
            Fecha f2 = new Fecha(32, 10, 2020);
        } catch (FechaException e){
            System.out.println(e.getMessage());
        }
        //Fecha f1 = new Fecha(10,10,2020);

    }
}
