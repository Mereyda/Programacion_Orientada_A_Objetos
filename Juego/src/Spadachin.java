public class Spadachin {
    private String nombre;
    private int energia;
    private int defensa;
    private int vidas;

    public Spadachin(String nombre, int energia, int defensa, int vidas) {
        this.nombre = nombre;
        this.energia = energia;
        this.defensa = defensa;
        this.vidas = vidas;
    }

    public void pegar(Spadachin x){
        System.out.println(" soy " + this.nombre + " y le voy a pegar ..." +x.nombre);
    }
    public void saludar( Spadachin x){

        System.out.println(" hola " + x.getNombre()+ " mi nombre es " +this.nombre);
        //x.setVidas(x.getVidas() - 1);
        //x.setVidas(x.getVidas() - 5);
        x.setVidas(x.getVidas()-this.energia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}
