public class Ejecutable {
    public static void main(String[] args) {
        Spadachin a1 = new Spadachin("nan", 100, 5, 2);
        Spadachin a2 = new Spadachin("naruto", 55, 5, 2);

        System.out.println(a1.getDefensa());
        System.out.println(a2.getDefensa());
        a1.saludar(a2);
        a2.saludar(a1);
        a1.pegar(a2);
        System.out.println(a2.getVidas());
    }

}
