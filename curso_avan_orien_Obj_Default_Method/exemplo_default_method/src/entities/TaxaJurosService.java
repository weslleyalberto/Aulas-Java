package entities;

import java.security.InvalidParameterException;

public interface TaxaJurosService {
    double getTaxaJuros();
    default double pagamento(double saldo, int mes){
        if(mes <1){
            throw new InvalidParameterException("Mes tem que ser maior que 1");
        }
        return saldo * Math.pow(1.0 + getTaxaJuros() / 100.0, mes);
    }
}
