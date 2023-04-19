public class Ejecutable {
    public static void main(String[] args) {
        Paciente p1 = new Paciente(94124722, "Pedro", 25, "ioma", true, new Medicos(1234, "Julio", "Lopez", 500.0),2, false, true);
        Medicos m1 = new Medicos(1234, "Raul", "Perez", 250.0);

        //p1.isParticular();
//        System.out.println(p1.isParticular());
//        System.out.println(p1.getCantidadEstudios());
//        System.out.println(m1.getNombre());
        System.out.println( " mi nombre es: " +p1.getNombre() + " y me atiendo con el doctor " + m1.getNombre() + " cuyo nro de matricula es: " +m1.getMatricula());

    }
}
