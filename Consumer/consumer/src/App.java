import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Produto;
import utils.PrecoUpdate;

public class App {
    public static void main(String[] args)  {
       Locale.setDefault(Locale.US);
       List<Produto> list = new ArrayList<>();
       list.add(new Produto("TV", 2599.90));
       list.add(new Produto("Smartphone", 3999.90));
       list.add(new Produto("Maquina de Lavar",5999.90));
        

       list.forEach(new PrecoUpdate());

      list.forEach(System.out::println);

    }
}
