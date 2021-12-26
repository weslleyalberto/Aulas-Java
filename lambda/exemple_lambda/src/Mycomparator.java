import java.util.Comparator;
import entities.Produto;

public class Mycomparator implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        
        return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
    }
    
}
