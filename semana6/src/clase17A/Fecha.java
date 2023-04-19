package clase17A;

public class Fecha {
     int day;
     int mont;
     int year;

    public Fecha(int day, int mont, int year) throws FechaException {
        if( day < 1|| day > 31)
            throw new FechaException(" el dia ingresado no corr a un dia valido");
        //this.day = day; lo pasamos al if. si es menor a generamos una nueva
        //this.mont = mont;
        //this.year = year;
        //throw new es para generar la excepcion
    }
}
