package entities;

import java.security.InvalidParameterException;

public class TaxaJurosBrasil {
    private Double taxaJuros;

    public TaxaJurosBrasil(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }
    public Double pagamento(double saldo, int mes){
        if(mes <1){
            throw new InvalidParameterException("Mes tem que ser maior que 1");
        }
        return saldo * Math.pow(1.0 + getTaxaJuros() / 100.0, mes);
    }

   
    
}
