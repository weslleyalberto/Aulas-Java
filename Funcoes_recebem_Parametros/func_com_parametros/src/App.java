import java.util.ArrayList;
import java.util.List;

import entities.Produto;
import services.ProdutoService;

public class App {
    public static void main(String[] args)  {
        List<Produto> list = new ArrayList<>();
        list.add(new Produto("Tv",900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD Case", 80.90));

        ProdutoService ps = new ProdutoService();
        double soma  = ps.filtedSum(list,c-> c.getNome().charAt(0) == 'M');
        double soma2 = ps.filtedSum(list, c-> c.getPreco() <100.0);
        System.out.println(soma);
        System.out.println("***************************");
        System.out.println(soma2);
    }
}
