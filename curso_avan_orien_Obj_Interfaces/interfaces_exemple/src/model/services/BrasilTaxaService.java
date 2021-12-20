package model.services;

public class BrasilTaxaService implements TaxService {
    public double tax(double saldo){
        if(saldo <= 100.0){
          return  saldo * 0.2;
        }
        else{
            return saldo * 0.15;
        }
    }
}
