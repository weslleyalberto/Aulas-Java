package model.entities;

public class Fatura {
    private Double pagamentoBase;
    private Double taxa;
    public Fatura() {
       
    }
    public Double getTaxa() {
        return taxa;
    }
    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
    public Double getPagamentoBase() {
        return pagamentoBase;
    }
    public void setPagamentoBase(Double pagamentoBase) {
        this.pagamentoBase = pagamentoBase;
    }
    public Fatura(Double pagamentoBase,Double taxa) {
        this.setPagamentoBase(pagamentoBase);
        this.setTaxa(taxa);
    }
    public Double getTotalPagamento(){
        return getPagamentoBase() + getTaxa();
    }
    
}
