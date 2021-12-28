package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Produto;

public class ProdutoService {
    
    public double filtedSum(List<Produto> list, Predicate<Produto> criterio){
        double sum = 0.0;
        for(Produto p : list){
            if(criterio.test(p)){
                sum+= p.getPreco();
            }
        }
        return sum;
    }
}
