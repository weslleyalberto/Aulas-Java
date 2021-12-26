import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class App {
    public static void main(String[] args)  {
       List<Produto> list = new ArrayList<>();
       list.add(new Produto("TV", 900.0));
       list.add(new Produto("Notebook", 1200.00));
       list.add(new Produto("Tablet", 450.00));
      
       
         

        list.sort((p1,p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase())); // reduzindo linhas de codigo (expressão lambda)
      list.sort(new Mycomparator());

       for(Produto p : list){
           System.out.println(p);
       }
    }
}
