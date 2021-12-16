package entities;

public class ContaEmpresa extends Conta {
    private Double limiteEmprestimo;
    public ContaEmpresa(){
        super();
    }
    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
    public ContaEmpresa(Integer numero,String holder,Double saldo, Double limiteEmprestimo){
        super(numero,holder,saldo);
        this.setLimiteEmprestimo(limiteEmprestimo);
    }
    public void emprestimo(double valorEmprestimo){
        if(valorEmprestimo <= limiteEmprestimo){
            saldo+= valorEmprestimo - 10.0;
        }
        
    }
    @Override
    public void saque(double saque){
        super.saque(saque);
        saldo -= 2.0;
    }
}
