import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Produto;

public class App {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        List<Produto> list = new ArrayList<>();
        list.add(new Produto("Tv",2599.90));
        list.add(new Produto("Notebook",5999.90));
        list.add(new Produto("Smartphone", 6999.90));

        list.removeIf(Produto::staticProdutoPredicate);

        for(Produto p : list){
            System.out.println(p);
        }
    }
}
