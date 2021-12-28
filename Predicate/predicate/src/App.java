import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Produto;

public class App {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        List<Produto> list = new ArrayList<>();
        list.add(new Produto("Tv",2599.90));
        list.add(new Produto("Notebook",5999.90));
        list.add(new Produto("Smartphone", 6999.90));

        Predicate<Produto> pred = p -> p.getPreco() > 3000.00;
        list.removeIf(Produto::noStaticProdutoPredicate); //Reference Method


        list.removeIf(pred); //Reference Method


        list.removeIf(c-> c.getPreco() > 2000.00);
        for(Produto p : list){
            System.out.println(p);
        }
    }
}
