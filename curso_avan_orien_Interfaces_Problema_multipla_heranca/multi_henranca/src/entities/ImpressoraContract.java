package entities;

public class ImpressoraContract extends Eletronico implements Impressora {

    public ImpressoraContract(String serialMumber) {
        super(serialMumber);
        
    }

    @Override
    public void imprimir(String doc) {
       System.out.println("Imprimindo..." + doc);
        
    }
    
}
