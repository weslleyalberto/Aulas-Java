import entities.Produto;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String [] args){
        Set<Produto> produtoSet = new TreeSet<Produto>();
        produtoSet.add(new Produto("Tv",1599.90));
        produtoSet.add(new Produto("Computador",5999.90));
        produtoSet.add(new Produto("Smarphone",2999.90));
       // Produto produto = new Produto("Computador",5999.90);

       for(Produto p :produtoSet){
           System.out.println(p);
       }
    }
}
