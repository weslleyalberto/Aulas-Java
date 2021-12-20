package model.entities;

import java.util.Date;

public class AluguelCarro {
    private Date inicio;
    private Date finalizacao;

    private Veiculo veiculo;
    private Fatura fatura;

    public AluguelCarro() {
       
    }
    public Fatura getFatura() {
        return fatura;
    }
    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public Date getFinalizacao() {
        return finalizacao;
    }
    public void setFinalizacao(Date finalizacao) {
        this.finalizacao = finalizacao;
    }
    public Date getInicio() {
        return inicio;
    }
    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }
    public AluguelCarro(Date inicio,Date finalizacao,Veiculo veiculo) {
        this.setInicio(inicio);
        this.setFinalizacao(finalizacao);
        this.setVeiculo(veiculo);
    }
}
