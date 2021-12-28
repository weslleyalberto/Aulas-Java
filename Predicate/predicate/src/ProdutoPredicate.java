import java.util.function.Predicate;

import entities.Produto;

public class ProdutoPredicate implements Predicate<Produto>{

    @Override
    public boolean test(Produto produto) {
      
        return  produto.getPreco() > 3000.00;
    }
    
}
