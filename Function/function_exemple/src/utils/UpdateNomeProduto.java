package utils;
import java.util.function.Function;

import entities.Produto;

public class UpdateNomeProduto implements Function<Produto,String> {

    @Override
    public String apply(Produto p) {
      
        return p.getNome().toUpperCase();
    }

    
}
