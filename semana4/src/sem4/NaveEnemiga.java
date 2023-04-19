package sem4;

public class NaveEnemiga extends Objeto{

    public NaveEnemiga(int posX, int posY, char direccion) {
        super(posX, posY, direccion);
    }

    @Override
    public void irA(int posX, int posY, char direccion) {
        System.out.println( " Estoy oersigyuendote " );
    }
}
