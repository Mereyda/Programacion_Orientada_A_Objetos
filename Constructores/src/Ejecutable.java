public class Ejecutable {


    public static void main(String[] args) {
       Persona a1= new Persona("Pablo", "Perez", 25);
      Persona a2= new Persona("calle 54 numero 1421");



      System.out.println("mi nombre es: " + a1.getNombre() +" " + a1.getApellido());
      System.out.println("vivo en: " +a2.getDireccion());
        System.out.println();
    }

}

///creo un objeto de tipo persona con una instancia llamamda a1.este
// es un constructor que tiene el mismo nomsbre que la clase. se usa new para usarlo
//para crear el objeto a2, tengo que crear otro constructor(en la clase persona)
// a la clase persona y a este le debo crear tamb el settersy getters para
//poder consultarlos desde el ejecutable.
//si quiero que el objeto juevo, a2, me muestre otro dato que no esta en a1 tengo que ir a la clase y crearle esa propiedad
// que quieor que tenga el nuevo objeto. en este ejerc le cree la propiedad "direccion" a la clase Persona y en el segunto objeto en el ejecutable le puse que me muestre
//direccion.

