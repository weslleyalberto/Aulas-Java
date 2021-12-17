package entities;

public  class ContaPoupanca extends Conta{
    private Double taxaDeJuros;
    public ContaPoupanca(){
        super();
    }
    public Double getTaxaDeJuros() {
        return taxaDeJuros;
    }
    public void setTaxaDeJuros(Double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
    public ContaPoupanca(Integer numero,String holder,Double saldo, double taxaDeJuros){
        super(numero,holder,saldo);
        this.setTaxaDeJuros(taxaDeJuros);
    }
    public void atualizacaoSaldo(){
        saldo += saldo * taxaDeJuros ;
    }
    @Override
    public final  void saque(double saque){
        saldo -= saque;
    }
    
}
