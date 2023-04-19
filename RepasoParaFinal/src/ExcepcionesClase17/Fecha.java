package ExcepcionesClase17;

public class Fecha {
    private int day;
    private int month;
    private int year;

    public Fecha(int day, int month, int year) throws Exception{
        if (day<1 || day>31 || month<1 || month>12)
            throw new Exception("los valores no son validos");
        else
            System.out.println("los valores son validos");
        this.day = day;
        this.month = month;
        this.year = year;
    }

}
