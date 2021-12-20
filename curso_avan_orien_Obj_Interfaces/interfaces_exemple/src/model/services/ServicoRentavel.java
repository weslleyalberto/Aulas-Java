package model.services;

import model.entities.AluguelCarro;
import model.entities.Fatura;

public class ServicoRentavel {
    private Double precoPorDia;
    private Double precoPorHora;
    private BrasilTaxaService taxaServiço;

    public ServicoRentavel(double precoPorDia,double precoPorHora,BrasilTaxaService taxaServico) {
       this.precoPorDia = precoPorDia;
       this.precoPorHora = precoPorHora;
       this.taxaServiço = taxaServico;
    }
    public void processarCustos(AluguelCarro aluguelCarro){
        long t1 = aluguelCarro.getInicio().getTime();
        long t2 = aluguelCarro.getFinalizacao().getTime();
        double horas =(double) (t2-t1) / 1000 / 60 / 60;
        double pagamentoBase;
        if(horas <=12.0){
             pagamentoBase = Math.ceil(horas) * precoPorHora;
        }
        else{
            pagamentoBase = Math.ceil(horas) * precoPorDia;
        }
        double tax = taxaServiço.tax(pagamentoBase);
        aluguelCarro.setFatura(new Fatura(pagamentoBase,tax));
    }
}
