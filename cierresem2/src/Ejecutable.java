public class Ejecutable {
    public static void main(String[] args) {
     Adopcion e1 = new Adopcion("labrador", "lobo", 2021, 20.5,true, false, false );
     Adopcion e2 = new Adopcion("caniche toy", "el bicho", 2022, 3.5, true, true);


        e2.esAdoptable();
        e1.edadOrientacion();
    }
}
