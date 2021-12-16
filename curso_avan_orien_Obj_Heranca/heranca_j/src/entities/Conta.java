package entities;


public class Conta {
    private Integer numero;
    private String holder;
    protected Double saldo;
    public Conta(Integer numero, String holder,Double saldo){
        this.numero = numero;
        this.holder = holder;
        this.saldo = saldo;
    }
    public Conta(){

    }
    public Double getSaldo() {
        return saldo;
    }
   
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public void saque(double saque){
        saldo-= saque + 5.0;
    }
    public void deposito(double deposito){
        saldo+=deposito;
    }
  
    
}
