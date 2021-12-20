package model.entities;

import model.exceptions.DomainException;

public class Conta {
    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteSaque;
    public Conta() {
        
    }
    public Conta(Integer numero,String titular,Double saldo,Double limiteSaque) {
       
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }
    public Integer getNumero(){
        return numero;
    }
    public String getTitular(){
        return titular;
    }
    public Double getSaldo(){
        return saldo;
    }
    public Double getLimiteSaque(){
        return limiteSaque;
    }
    public void deposito(Double valor){
        saldo+= valor;
    }
    public void saque(Double valor) throws DomainException{
        if(saldo <= valor ){
            throw new DomainException("Erro: Não há saldo suficiente");
        }
        else if(valor > getLimiteSaque()){
            throw new DomainException("Erro: O limite para saque é superior ou permitido" );
        }
        else{
            saldo -= valor;
        }
        
           
        
        
    }
    @Override
    public String toString(){
        return "Numero conta: " + getNumero() + ", " + "Titular: " + getTitular() + ", " + "Saldo: R$ " + String.format("%.2f", getSaldo())
        + ", " + "Limite de saque: R$ " + String.format("%.2f", getLimiteSaque());
    }
}
