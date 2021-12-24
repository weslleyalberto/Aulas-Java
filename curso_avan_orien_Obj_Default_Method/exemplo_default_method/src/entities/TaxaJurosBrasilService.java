package entities;



public class TaxaJurosBrasilService implements TaxaJurosService{
    private Double taxaJuros;

    public TaxaJurosBrasilService(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    @Override
    public double getTaxaJuros() {
        return taxaJuros;
    }
   

   
    
}
