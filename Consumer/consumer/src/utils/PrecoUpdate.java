package utils;

import java.util.function.Consumer;

import entities.Produto;

public class PrecoUpdate implements Consumer<Produto> {

    @Override
    public void accept(Produto p) {
       p.setPreco(p.getPreco() * 1.1);
        
    }
    
}
