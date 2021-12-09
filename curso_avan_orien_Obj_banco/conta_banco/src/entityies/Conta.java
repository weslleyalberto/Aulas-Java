package entityies;

public class Conta {
    private final int  numeroConta;
    private String titular;
    private double depositoInicial ;
   
    private final double taxaSaque = 5.00;
    private double saldo;

    
    public Conta(String titular,int numeroConta, double depositoInicial  ) {
        this.titular = titular;
        this.numeroConta = numeroConta;
      
        this.depositoInicial = depositoInicial;
       

    }
    
    public double Saldo(){
        return this.saldo + this.depositoInicial;
    }
    public double Depositar(double valor){
       
        this.saldo += valor;
        return saldo;
    }
    public double Sacar(double valorSaque){
        saldo -= valorSaque;
        saldo -= this.taxaSaque;
        return saldo;
    }
    public String toString(){
        return "Titular: " + this.titular + 
        " - " + "Número da conta: " + this.numeroConta + 
        " - " + "Saldo: " + String.format("%.2f", Saldo());
    }






}
