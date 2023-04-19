import java.util.EmptyStackException;

public class EmpleadoFactory {
    public static final String CODIGO_EMPLEADO_RELACION = "EMP-RD";
    public static final String CODIGO_EMPLEADO_POR_HORA = "EMP-PH";

    private EmpleadoFactory(){

    }

    private static EmpleadoFactory instance;

    public static EmpleadoFactory getInstance() {
        if(instance == null){
            instance = new EmpleadoFactory();
        }
        return instance;

    }
    public Empleado crearEmpleado(String codigo){
        switch (codigo){
            case CODIGO_EMPLEADO_RELACION:
                return new EmpleadoRelacionDependencia();
            case CODIGO_EMPLEADO_POR_HORA:
                return new EmpleadoContratado();
            default:
                return null;

        }
    }
}
