package clase21;

public class main {
    public static void main(String[] args) {

        Reparacion r = new Reparacion("monopatin");
        try {
            r.valorPresupuesto(400);
            r.siguientePaso();
            r.sumarepuesto(500);


        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
