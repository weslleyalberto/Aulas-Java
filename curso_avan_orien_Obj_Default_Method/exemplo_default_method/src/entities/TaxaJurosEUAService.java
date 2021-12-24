package entities;



public class TaxaJurosEUAService implements TaxaJurosService{
    private Double taxaJuros;

    public TaxaJurosEUAService(Double taxaJuros) {
       this.taxaJuros = taxaJuros;
    }

    @Override
    public double getTaxaJuros() {
        return taxaJuros;
    }
    

    

}
