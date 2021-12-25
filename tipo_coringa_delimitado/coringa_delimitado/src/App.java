import java.util.ArrayList;
import java.util.List;

import model.Circulo;
import model.Retangulo;
import model.Shape;

public class App {
    public static void main(String[] args)  {
       List<Shape> myShapes = new ArrayList<>();
       myShapes.add(new Retangulo(3.0, 2.0));
       myShapes.add(new Circulo(2.0));

       List<Circulo> myCirculos = new ArrayList<>();
       myCirculos.add(new Circulo(2.0));
       myCirculos.add(new Circulo(3.0));
       System.out.println("Area total: " + totalArea(myCirculos));
    }
    public static double totalArea(List<? extends Shape> list){ //Tipo lista extende Shape
        double soma  = 0.0;
        for(Shape s : list){
            soma+= s.area();
        }
        return soma;
    }
}
