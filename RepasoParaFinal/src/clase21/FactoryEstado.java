package clase21;

public class FactoryEstado {
    private static FactoryEstado instancia;


    public static FactoryEstado getInstance() {
        if (instancia == null)
            instancia = new FactoryEstado();
        return instancia;

    }

    public  ReparacionState getEstado(String tipo, Reparacion r){
       switch (tipo){
            case "EnPresupuesto":
                return new EnPresupuesto(r);
           case "EnProceso":
               return new EnProceso(r);
           default:
               System.out.println("Error");
               return null;
        }
    }



}
