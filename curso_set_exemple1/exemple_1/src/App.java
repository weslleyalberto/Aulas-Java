import java.util.HashSet;
import java.util.Set;

import entities.Produto;

public class App {
    public static void main(String[] args)  {
        Set<Produto> produtoSet = new HashSet<>();
        produtoSet.add(new Produto("Tv", 2599.90));
        produtoSet.add(new Produto("Computador",5999.90));
        produtoSet.add(new Produto("Smartphone",4599.99));
        Produto prod = new Produto("Smartphone",4599.99);

        System.out.println(produtoSet.contains(prod));


    }
}
