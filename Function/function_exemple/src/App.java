import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Produto;
import utils.UpdateNomeProduto;

public class App {
    public static void main(String[] args)  {
       List<Produto> list = new ArrayList<>();
       list.add(new Produto("Tv",900.00));
       list.add(new Produto("Smartphone",2999.90));
       list.add(new Produto("Mouse", 29.90));
       list.add(new Produto("Tablet", 1090.90));


      // List<String> nomes  =list.stream().map(new UpdateNomeProduto()).collect(Collectors.toList());
      List<String> nomes  =list.stream().map(Produto::staticUpdateNome).collect(Collectors.toList()); // usando reference method
       nomes.forEach(System.out::println);
    }
}
