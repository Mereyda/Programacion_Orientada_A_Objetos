package clase17A;

public class FechaException extends Exception{



    public FechaException(String message) {
        super(message);
    }

    public String toString(){
        return " se produjo una excepcion de tipo..." +this.getClass().getName()+" "+" mensaje :" +this.getClass();
        //estamos obte el nombre de la clase exception

    }
}
