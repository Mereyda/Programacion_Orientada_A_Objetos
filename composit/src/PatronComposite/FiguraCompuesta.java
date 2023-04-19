package PatronComposite;

import java.util.ArrayList;
import java.util.List;

public class FiguraCompuesta extends Figura{
    private List<Figura> figuras;


    public FiguraCompuesta() {
        this.figuras = new ArrayList<Figura>();
    }



    public void agregar(Figura figura){
        this.figuras.add(figura);

    }

    @Override
    public double calcularArea() {
        double area = 0;
        for (Figura cadaUna: figuras )
            area += cadaUna.calcularArea();
        return area;


    }
}
